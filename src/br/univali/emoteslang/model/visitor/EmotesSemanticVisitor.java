/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang.model.visitor;

import br.univali.emoteslang.model.analise.Escopo;
import br.univali.emoteslang.model.analise.Identificador;
import br.univali.emoteslang.model.analise.Identificador.Tipo;
import br.univali.emoteslang.model.language.EmoteslangParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author rafael
 */
public class EmotesSemanticVisitor extends EmotesVisitor {

    List<String> warnings = new ArrayList<>();
    Stack<Identificador.Tipo> pilhaTipoExpressao = new Stack<>();
    Stack<Operation> pilhaOperacao = new Stack<>();
    boolean temRetorno = false;
    Tipo tipoFuncao = null;
    int contEscopo = 1;

    public EmotesSemanticVisitor(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
    }

    public List<Identificador> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    @Override
    public Object visitProgram(EmoteslangParser.ProgramContext ctx) {
        escopoAtual = new Escopo("programa");
        markAllFunctions(ctx);
        visitChildren(ctx);
        return tabelaSimbolos;
    }

    @Override
    public Object visitTypeWithVoid(EmoteslangParser.TypeWithVoidContext ctx) {
        if (ctx.TP_VOID() != null) {
            tipoAtual = Tipo.VOID;
        } else {
            visitType(ctx.type());
        }
        return null;
    }

    @Override
    public Object visitExpression(EmoteslangParser.ExpressionContext ctx) {
        if (ctx == null) {
            return null;
        }
        this.pilhaTipoExpressao.clear();
        this.pilhaOperacao.clear();

        for (EmoteslangParser.OperationsContext opCont : ctx.operations()) {
            this.pilhaOperacao.push(verificarTipoOperacao(opCont));
        }
        for (int i = 0; i < ctx.finalValue().size(); i++) {
            String valFinal = ctx.finalValue(i).getText();

            if (ctx.finalValue(i).array() != null) {
                valFinal = ctx.finalValue(i).array().ID().getText();
            }
            if (ctx.finalValue(i).functionCall() != null) {
                visitFunctionCall(ctx.finalValue(i).functionCall());
                valFinal = ctx.finalValue(i).functionCall().ID().getText();
            }
            if (ctx.finalValue(i).LEFT_PARENTESIS() != null) {
                this.pilhaTipoExpressao.push(visitExpressionLoop(ctx.finalValue(i).expression()));
                continue;
            }

            if (Identificador.getId(valFinal, tabelaSimbolos, escopoAtual) != null) {
                Identificador id = Identificador.getId(valFinal, tabelaSimbolos, escopoAtual);
                if (ctx.finalValue(i).array() != null) {
                    Tipo posVet = visitExpressionLoop(ctx.finalValue(i).array().arrayIndex().expression());
                    if (posVet != Tipo.INTEIRO) {
                        throw new ParseCancellationException("Tentando acessar posição de vetor com tipo não inteiro na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                    }
                    visitArray(ctx.finalValue(i).array());
                } else {
                    multidimensional = 0;
                }

                if (!id.isInicializada()) {
                    if (id.getDimensoes() == 0) {
                        this.warnings.add("Váriavel " + valFinal + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                    }else{
                        this.warnings.add("Vetor " + valFinal + " não inicializado Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                    }
                } else if (id.getDimensoes() != multidimensional) {
                    throw new ParseCancellationException("Dimensões incorreta do vetor " + ctx.finalValue(i).ID() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                }

                id.setUsada(true);
                this.pilhaTipoExpressao.push(id.getTipo());

            } else if (verificarTipoConstante(ctx.finalValue(i)) == null && Identificador.getUNSAFEId(valFinal, tabelaSimbolos) == null) {
                throw new ParseCancellationException("Váriavel " + ctx.finalValue(i).ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            } else {
                this.pilhaTipoExpressao.push(verificarTipoConstante(ctx.finalValue(i)));
            }
        }
        verificarCompatibilidadeOperacao(ctx, this.pilhaTipoExpressao, this.pilhaOperacao);
        return null;
    }

    public Tipo visitExpressionLoop(EmoteslangParser.ExpressionContext ctx) {
        if (ctx == null) {
            return null;
        }
        Stack<Identificador.Tipo> pilhaTipoExpressaoLoop = new Stack<>();
        Stack<Operation> pilhaOperacaoLoop = new Stack<>();

        for (EmoteslangParser.OperationsContext opCont : ctx.operations()) {
            pilhaOperacaoLoop.push(verificarTipoOperacao(opCont));
        }
        for (int i = 0; i < ctx.finalValue().size(); i++) {
            String valFinal = ctx.finalValue(i).getText();
            Tipo tipoExpParenteses = null;
            if (ctx.finalValue(i).array() != null) {
                valFinal = ctx.finalValue(i).ID().getText();
            }
            if (ctx.finalValue(i).functionCall() != null) {
                visitFunctionCall(ctx.finalValue(i).functionCall());
                valFinal = ctx.finalValue(i).functionCall().getText();
            }
            if (ctx.finalValue(i).LEFT_PARENTESIS() != null) {
                pilhaTipoExpressaoLoop.push(visitExpressionLoop(ctx.finalValue(i).expression()));

                continue;
            }
            if (Identificador.getId(valFinal, tabelaSimbolos, escopoAtual) != null) {
                Identificador id = Identificador.getId(valFinal, tabelaSimbolos, escopoAtual);
                if (ctx.finalValue(i).array() != null) {
                    Tipo posVet = visitExpressionLoop(ctx.finalValue(i).array().arrayIndex().expression());
                    if (posVet != Tipo.INTEIRO) {
                        throw new ParseCancellationException("Tentando acessar posição de vetor com tipo não inteiro na Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                    }
                    visitArray(ctx.finalValue(i).array());
                } else {
                    multidimensional = 0;
                }

                if (!id.isInicializada()) {
                    this.warnings.add("Váriavel " + ctx.finalValue(i).ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                } else if (id.getDimensoes() != multidimensional) {
                    throw new ParseCancellationException("Dimensões incorreta do vetor " + ctx.finalValue(i).ID() + " . Ele possui " + id.getDimensoes() + " dimensões e foi usada " + multidimensional + " Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
                }

                id.setUsada(true);
                pilhaTipoExpressaoLoop.push(id.getTipo());

            } else if (verificarTipoConstante(ctx.finalValue(i)) == null && tipoExpParenteses == null) {
                throw new ParseCancellationException("Váriavel " + ctx.finalValue(i).ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            } else {
                if (tipoExpParenteses != null) {
                    pilhaTipoExpressaoLoop.push(verificarTipoConstante(ctx.finalValue(i)));
                }
                pilhaTipoExpressaoLoop.push(verificarTipoConstante(ctx.finalValue(i)));
            }
        }
        verificarCompatibilidadeOperacao(ctx, pilhaTipoExpressao, pilhaOperacao);
        if (pilhaTipoExpressaoLoop.empty()) {
            return null;
        }
        return pilhaTipoExpressaoLoop.peek();
    }

    public Tipo verificarTipoConstante(EmoteslangParser.FinalValueContext val) {
        if (val.BIN() != null) {
            return Tipo.BINARIO;
        } else if (val.BOOLEAN() != null) {
            return Tipo.LOGICO;
        } else if (val.DOUBLE() != null || val.FLOAT() != null) {
            return Tipo.REAL;
        } else if (val.HEXA() != null) {
            return Tipo.HEXADECIMAL;
        } else if (val.INT() != null) {
            return Tipo.INTEIRO;
        } else if (val.STRING() != null) {
            return Tipo.STRING;
        } else if (val.CHAR() != null) {
            return Tipo.CHAR;
        }
        return null;
    }

    public void verificarCompatibilidadeOperacao(EmoteslangParser.ExpressionContext ctx, Stack<Tipo> pilhaTipoExpressao, Stack<Operation> pilhaOperacao) {
        if (pilhaOperacao.empty() || pilhaTipoExpressao.size() != pilhaOperacao.size() + 1) {

            return;
        }
        int resultExp;
        Tipo tipo1, tipo2;
        Operation op;
        while (!pilhaOperacao.empty()) {
            tipo1 = pilhaTipoExpressao.pop();
            tipo2 = pilhaTipoExpressao.pop();

            op = pilhaOperacao.pop();
            int resulExp = SemanticTable.resultType(tipo1, tipo2, op);
            if (resulExp == SemanticTable.ERR) {
                throw new ParseCancellationException("Tentando realizar uma " + op.name() + " entre " + tipo1.name() + " e " + tipo2.name() + " na linha " + ctx.start.getLine());
            }
            pilhaTipoExpressao.push(SemanticTable.getCodeType(resulExp));
        }
    }

    @Override
    public Object visitArray(EmoteslangParser.ArrayContext ctx) {
        multidimensional = 1;
        qtdMultidimensional = 1;
        if (ctx.arrayIndex().expression().finalValue(0).INT() != null) {
            String item = ctx.arrayIndex().expression().getText();
            qtdMultidimensional *= Integer.parseInt(item);
        }
        return null;
    }

    @Override
    public Object visitArrayIndex(EmoteslangParser.ArrayIndexContext ctx) {
        multidimensional = 1;
        qtdMultidimensional = 1;
        if (ctx.expression().finalValue(0).INT() != null) {
            String item = ctx.expression().getText();
            qtdMultidimensional *= Integer.parseInt(item);
        }
        return null;
    }

    @Override
    public Object visitArraySize(EmoteslangParser.ArraySizeContext ctx) {
        return super.visitArraySize(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttribution(EmoteslangParser.AttributionContext ctx) {
        Identificador id;
        if (!(ctx.array() != null)) {
            id = Identificador.getId(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual);
        } else {
            id = Identificador.getId(ctx.array().ID().getSymbol().getText(), tabelaSimbolos, escopoAtual);
        }
        if (id == null) {
            throw new ParseCancellationException("Váriavel " + ctx.ID() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }
        if (ctx.un_op() != null && !id.isInicializada()) {
            throw new ParseCancellationException("Váriavel " + ctx.ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }
        if (id.getDimensoes() > 0 && ctx.array().arrayIndex() == null) {
            throw new ParseCancellationException("Tentando atribuir ao vetor " + id.getNome() + " sem dizer a posiçao na linha " + ctx.start.getLine());
        }

        if (ctx.un_op() != null) {
            Operation unario;
            if (ctx.un_op().UN_ADD() != null) {
                unario = Operation.SOMA;
            } else if (ctx.un_op().UN_SUB() != null) {
                unario = Operation.SUBTRACAO;
            }
        } else {
            visitExpression(ctx.expression());
            verificarCompatibilidadeAtribuicao(id.getTipo(), ctx);
        }
        id.setInicializada(true);

        return null;
    }

    @Override
    public Object visitBreakdes(EmoteslangParser.BreakdesContext ctx) {
        return super.visitBreakdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCasedes(EmoteslangParser.CasedesContext ctx) {
        return super.visitCasedes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCommand(EmoteslangParser.CommandContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitCommandList(EmoteslangParser.CommandListContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitCommands(EmoteslangParser.CommandsContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitCondition(EmoteslangParser.ConditionContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitConditionals(EmoteslangParser.ConditionalsContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitDeclaration(EmoteslangParser.DeclarationContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitStatements(EmoteslangParser.StatementsContext ctx) {
        visitType(ctx.type());
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx) {
        multidimensional = 1;
        qtdMultidimensional = 1;
        String item = "1";
        if (ctx.arraySize().INT() != null) {
            item = ctx.arraySize().INT().getText();
        }
        qtdMultidimensional *= Integer.parseInt(item);

        TerminalNode id = ctx.ID();

        boolean inicializada;
        if (ctx.ATTRIBUTION() != null) {
            inicializada = true;
        } else {
            inicializada = false;
        }
        if (Escopo.verificaSeExisteNoEscopo(id.getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
            throw new ParseCancellationException("Declaração de Váriavel " + ctx.ID() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }

        Identificador ident = new Identificador(
                id.getSymbol().getText(),
                tipoAtual,
                inicializada,
                false,
                escopoAtual,
                false,
                false,
                0,
                multidimensional,
                qtdMultidimensional,
                false);
        tabelaSimbolos.add(ident);
        visitChildren(ctx);
        System.out.println(ident.getTipo());
        if (inicializada) {
//            System.out.println("DEVE VERIFICAR OS TIPOS AQUI");
//            verificarCompatibilidadeAtribuicao(ident.getTipo(), ctx);;
        }
        return null;
    }

    @Override
    public Object visitParamArray(EmoteslangParser.ParamArrayContext ctx) {
        multidimensional = 1;
        qtdMultidimensional = 1;
        String item = ctx.expression().getText();
        qtdMultidimensional *= Integer.parseInt(item);
        return null;
    }

    @Override
    public Object visitDeclarationMatrix(EmoteslangParser.DeclarationMatrixContext ctx) {
        return super.visitDeclarationMatrix(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationVar(EmoteslangParser.DeclarationVarContext ctx) {
        multidimensional = 0;
        qtdMultidimensional = 1;
        TerminalNode id = ctx.ID();

        boolean inicializada;
        if (ctx.ATTRIBUTION() != null) {
            inicializada = true;
        } else {
            inicializada = false;
        }
        if (Escopo.verificaSeExisteNoEscopo(id.getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
            throw new ParseCancellationException("Declaração de Váriavel " + ctx.ID() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }

        Identificador ident = new Identificador(
                id.getSymbol().getText(),
                tipoAtual,
                inicializada,
                false,
                escopoAtual,
                false,
                false,
                0,
                multidimensional,
                qtdMultidimensional,
                false);
        tabelaSimbolos.add(ident);
        visitChildren(ctx);
        System.out.println(ident.getTipo());
        if (inicializada) {
            verificarCompatibilidadeAtribuicao(ident.getTipo(), ctx);
        }
        return null;
    }

    @Override
    public Object visitDefaultdes(EmoteslangParser.DefaultdesContext ctx) {
        return super.visitDefaultdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDoWhile(EmoteslangParser.DoWhileContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("doWhile_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitFordes(EmoteslangParser.FordesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("for_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitFunctions(EmoteslangParser.FunctionsContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }
        escopoAtual = getEscopoDaFuncao(ctx.ID().getText());

        if (ctx.typeWithVoid().type() != null) {
            tipoFuncao = verificarTipo(ctx.typeWithVoid().type());
        }

        for (int i = 0; i < ctx.commands().size(); i++) {
            visitCommands(ctx.commands(i));
        }

        if (ctx.typeWithVoid().type() != null && !temRetorno && !ctx.ID().getSymbol().getText().equals("main")) {
            throw new ParseCancellationException("Funcao " + ctx.ID().getText() + " não tem retorno necessário");
        }
        temRetorno = false;
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitReturndes(EmoteslangParser.ReturndesContext ctx) {
        Tipo tipoExpressao = visitExpressionLoop(ctx.expression());
        if (tipoExpressao == tipoFuncao) {
            temRetorno = true;
        }
        return null;
    }

    @Override
    public Object visitIfdes(EmoteslangParser.IfdesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("if_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdeselse(EmoteslangParser.IfdeselseContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitIfdeselseif(EmoteslangParser.IfdeselseifContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("else_if_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitExpressionList(EmoteslangParser.ExpressionListContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitInitializeFor(EmoteslangParser.InitializeForContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitIncrementFor(EmoteslangParser.IncrementForContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitInitializeArray(EmoteslangParser.InitializeArrayContext ctx) {
        return super.visitInitializeArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializeMatrix(EmoteslangParser.InitializeMatrixContext ctx) {
        return super.visitInitializeMatrix(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInputAndOutput(EmoteslangParser.InputAndOutputContext ctx) {
        List<EmoteslangParser.ExpressionContext> expression = ctx.parametersCall().expression();
        for (EmoteslangParser.ExpressionContext exp : expression) {
            visitExpression(exp);
            if (ctx.READ() != null && exp.finalValue(0).ID() != null) {
                String text = exp.finalValue(0).ID().getSymbol().getText();
                Identificador id = Identificador.getId(text, tabelaSimbolos, escopoAtual);
                id.setInicializada(true);
            }
        }
        return null;
    }

    @Override
    public Object visitMatrixCol(EmoteslangParser.MatrixColContext ctx) {
        return super.visitMatrixCol(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMatrixLine(EmoteslangParser.MatrixLineContext ctx) {
        return super.visitMatrixLine(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParamMatrix(EmoteslangParser.ParamMatrixContext ctx) {
        return super.visitParamMatrix(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParameter(EmoteslangParser.ParameterContext ctx) {
        return super.visitParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametersCall(EmoteslangParser.ParametersCallContext ctx) {
        return super.visitParametersCall(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFunctionCall(EmoteslangParser.FunctionCallContext ctx) {
        Identificador id = Identificador.getUNSAFEId(ctx.ID().getText(), tabelaSimbolos);

        //Vê se a função existe
        if (id == null) {
            throw new ParseCancellationException("Chamada de função inexistente na " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + ".");
        }
        id.setUsada(true);

        //Captura os parametros da função e numeros
        Escopo escopoFuncao = getEscopoDaFuncao(id.getNome());
        int qtdParametrosNaFuncao;
        List<Identificador> idListParametros = null;
        if (escopoFuncao != null) {
            idListParametros = Identificador.getParametrosFuncao(escopoFuncao, tabelaSimbolos);
            qtdParametrosNaFuncao = idListParametros.size();
        } else {
            qtdParametrosNaFuncao = 0;
        }

        List<Tipo> tiposParam = new ArrayList<>();
        for (EmoteslangParser.ExpressionContext expressionContext : ctx.parametersCall().expression()) {
            tiposParam.add(visitExpressionLoop(expressionContext));
        }
        int qtdParametrosChamada = ctx.parametersCall().expression().size();

        //Valida se os numeros de parametros bate
        if (qtdParametrosChamada != qtdParametrosNaFuncao) {
            throw new ParseCancellationException("Chamada de função na linha " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + " com numero incorreto de parametros. Esperado: " + qtdParametrosNaFuncao + " Encontrado: " + qtdParametrosChamada);
        }
        //verifica os tipos dos parametros das funcoes
        if (idListParametros != null && !tiposParam.isEmpty()) {
            Iterator<Tipo> expIte = tiposParam.iterator();
            Iterator<Identificador> paramIte = idListParametros.iterator();
            while (expIte.hasNext() && paramIte.hasNext()) {
                Identificador parametroFuncao = paramIte.next();
                Tipo tipoParametroChamada = expIte.next();
                if (parametroFuncao.getTipo() != tipoParametroChamada) {
                    throw new ParseCancellationException("Chamada de função na linha " + ctx.start.getLine() + " coluna " + ctx.start.getCharPositionInLine() + " está com parametros com tipos incorretos Esperado: " + parametroFuncao.getTipo().name() + " Recebido: " + tipoParametroChamada.name());
                }
            }
        }
        visitChildren(ctx);
        return null;

        //Valida se os parametros que estão sendo passados existem se forem IDs
    }

    @Override
    public Object visitParametersList(EmoteslangParser.ParametersListContext ctx) {
        for (int i = 0; i < ctx.parameter().size(); i++) {
            String idName = ctx.parameter(i).ID().getSymbol().getText();
            if (Escopo.verificaSeExisteNoEscopo(idName, tabelaSimbolos, escopoAtual)) {
                throw new ParseCancellationException("Declaração de Váriavel " + idName + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            }
            multidimensional = 0;
            qtdMultidimensional = 1;
            if (ctx.parameter(i).paramArray() != null) {
                visitParamArray(ctx.parameter(i).paramArray());
            }

            visitType(ctx.parameter(i).type());
            Identificador id = new Identificador(
                    idName,
                    tipoAtual,
                    true,
                    false,
                    escopoAtual,
                    true,
                    ctx.parameter(i).BIT_AND() != null,
                    i + 1,
                    multidimensional, // Só aceita unidimensional como parametro... 
                    false);
            tabelaSimbolos.add(id);
        }

        return null;
    }

    @Override
    public Object visitSwitchdes(EmoteslangParser.SwitchdesContext ctx) {
        return super.visitSwitchdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWhiledes(EmoteslangParser.WhiledesContext ctx) {
        escopoAtual = Escopo.criaEVaiEscopoNovo("while_" + contEscopo++, escopoAtual);
        visitChildren(ctx);
        retornaEscopoPai();
        return null;
    }

    @Override
    public Object visitFinalValue(EmoteslangParser.FinalValueContext ctx) {
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitType(EmoteslangParser.TypeContext ctx) {
        if (ctx.TP_BIN() != null) {
            tipoAtual = Tipo.BINARIO;
        } else if (ctx.TP_BOOL() != null) {
            tipoAtual = Tipo.LOGICO;
        } else if (ctx.TP_DOUBLE() != null || ctx.TP_FLOAT() != null) {
            tipoAtual = Tipo.REAL;
        } else if (ctx.TP_HEX() != null) {
            tipoAtual = Tipo.HEXADECIMAL;
        } else if (ctx.TP_INT() != null) {
            tipoAtual = Tipo.INTEIRO;
        } else if (ctx.TP_STRING() != null) {
            tipoAtual = Tipo.STRING;
        } else if (ctx.TP_CHAR() != null) {
            tipoAtual = Tipo.CHAR;
        }
        return null;
    }

    public Tipo verificarTipo(EmoteslangParser.TypeContext tipo) {
        if (tipo.TP_BIN() != null) {
            return Tipo.BINARIO;
        } else if (tipo.TP_BOOL() != null) {
            return Tipo.LOGICO;
        } else if (tipo.TP_DOUBLE() != null) {
            return Tipo.REAL;
        } else if (tipo.TP_HEX() != null) {
            return Tipo.HEXADECIMAL;
        } else if (tipo.TP_INT() != null) {
            return Tipo.INTEIRO;
        } else if (tipo.TP_STRING() != null) {
            return Tipo.STRING;
        } else if (tipo.TP_CHAR() != null) {
            return Tipo.CHAR;
        }
        return null;
    }

    /**
     * Adiciona todas as funções na tabela de simbolos. Assim se uma função
     * chamar outra função ela vai ver que ela existe.
     *
     * @param ctxProg
     */
    private void markAllFunctions(EmoteslangParser.ProgramContext ctxProg) {
        List<EmoteslangParser.FunctionsContext> fctx = ctxProg.functions();
        for (EmoteslangParser.FunctionsContext ctx : fctx) {
            visitTypeWithVoid(ctx.typeWithVoid());
            if (Escopo.verificaSeExisteNoEscopo(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
                throw new ParseCancellationException("Declaração de Função " + ctx.ID().getSymbol().getText() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            }
            boolean usada = false;
            if (ctx.ID().getSymbol().getText().equals("main")) {
                usada = true;
            }
            Identificador id = new Identificador(
                    ctx.ID().getSymbol().getText(),
                    tipoAtual,
                    true,
                    usada,
                    escopoAtual,
                    false,
                    false,
                    0,
                    0,
                    true);
            tabelaSimbolos.add(id);

            escopoAtual = Escopo.criaEVaiEscopoNovo(ctx.ID().getText(), escopoAtual);
            if (ctx.parametersList() != null) {
                visitParametersList(ctx.parametersList());
            }
            retornaEscopoPai();
        }
    }

    /**
     * Passe a ele o idNome da função que ele te retornara o escopo que a função
     * criou.
     *
     * @param idName
     * @return
     */
    private Escopo getEscopoDaFuncao(String idName) {
        Escopo escopo = null;
        for (Identificador identificador : tabelaSimbolos) {
            if (identificador.getNome().equals(idName)) {
                escopo = identificador.getEscopo();
                break;
            }
        }
        if (escopo == null) {
            throw new ParseCancellationException("Escopo não encontrado");
        }

        for (Escopo subEscopo : escopo.getSubEscopos()) {
            if (subEscopo.getNome().equals(idName)) {
                return subEscopo;
            }
        }
        return null;
    }

    public Operation verificarTipoOperacao(EmoteslangParser.OperationsContext opContext) {

        if (opContext.op_aritmetic() != null) {
            if (opContext.op_aritmetic().ADD() != null) {
                return Operation.SOMA;
            }
            if (opContext.op_aritmetic().SUB() != null) {
                return Operation.SUBTRACAO;
            }
            if (opContext.op_aritmetic().DIV() != null) {
                return Operation.DIVISAO;
            }
            if (opContext.op_aritmetic().MULT() != null) {
                return Operation.MULTIPLICACAO;
            }
            if (opContext.op_aritmetic().MOD() != null) {
                return Operation.MOD;
            }
        }

        if (opContext.op_bitwise() != null) {
            if (opContext.op_bitwise().BIT_RS() != null) {
                return Operation.BITSHIFTRIGHT;
            }
            if (opContext.op_bitwise().BIT_LS() != null) {
                return Operation.BITSHIFTLEFT;
            }
            if (opContext.op_bitwise().BIT_NOT() != null) {
                return Operation.BITNOT;
            }
            if (opContext.op_bitwise().BIT_AND() != null) {
                return Operation.AND;
            }
            if (opContext.op_bitwise().BIT_OR() != null) {
                return Operation.OR;
            }
            if (opContext.op_bitwise().BIT_XOR() != null) {
                return Operation.OR;
            }
        }

        if (opContext.op_logic() != null) {
            if (opContext.op_logic().AND() != null) {
                return Operation.AND;
            }
            if (opContext.op_logic().NOT() != null) {
                return Operation.NOT;
            }
            if (opContext.op_logic().OR() != null) {
                return Operation.OR;
            }
        }

        if (opContext.op_neg() != null) {
            if (opContext.op_neg().BIT_NOT() != null) {
                return Operation.BITNOT;
            }
            if (opContext.op_neg().NOT() != null) {
                return Operation.NOT;
            }
            if (opContext.op_neg().SUB() != null) {
                return Operation.SUBTRACAO;
            }
        }

        if (opContext.op_rel() != null) {
            if (opContext.op_rel().DIFFERENT() != null) {
                return Operation.DIFERENTE;
            }
            if (opContext.op_rel().EQUALS() != null) {
                return Operation.IDENTICO;
            }
            if (opContext.op_rel().BIGGERE() != null) {
                return Operation.MAIOROUIGUAL;
            }
            if (opContext.op_rel().BIGGERT() != null) {
                return Operation.MAIORQUE;
            }
            if (opContext.op_rel().SMALLERE() != null) {
                return Operation.MENOROUIGUAL;
            }
            if (opContext.op_rel().SMALLERT() != null) {
                return Operation.MENORQUE;
            }
        }
        return null;
    }

    public void verificarCompatibilidadeAtribuicao(Tipo tipoVariavelFinal, ParserRuleContext ctx) {
        if (this.pilhaTipoExpressao.isEmpty()) {
            return;
        }
        Tipo tipoAtribuicao = this.pilhaTipoExpressao.pop();
        int resultAtr = SemanticTable.atribType(tipoVariavelFinal, tipoAtribuicao);
        if (resultAtr == SemanticTable.ERR) {
            throw new ParseCancellationException("Tentando atribuir um " + tipoAtribuicao.name() + " a um " + tipoVariavelFinal.name() + " na linha " + ctx.start.getLine());
        }
        if (resultAtr == SemanticTable.WAR) {
            this.warnings.add("Atribuindo um " + tipoAtribuicao.name() + " a um " + tipoVariavelFinal.name() + " na linha " + ctx.start.getLine());
        }
    }

    public List<String> getWarnings() {
        return warnings;
    }

}
