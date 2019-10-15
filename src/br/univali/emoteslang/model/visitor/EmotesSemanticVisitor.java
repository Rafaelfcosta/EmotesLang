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
import java.util.List;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author rafael
 */
public class EmotesSemanticVisitor extends EmotesVisitor {

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

        return super.visitExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArrayIndex(EmoteslangParser.ArrayIndexContext ctx) {
        return super.visitArrayIndex(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitArraySize(EmoteslangParser.ArraySizeContext ctx) {
        return super.visitArraySize(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAttribution(EmoteslangParser.AttributionContext ctx) {
        Identificador id = Identificador.getId(ctx.ATTRIBUTION().getSymbol().getText(), tabelaSimbolos, escopoAtual);
        if (id == null) {
            throw new ParseCancellationException("Váriavel " + ctx.ATTRIBUTION() + " não existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }

        if ((ctx.expression().UN_ADD() != null || ctx.expression().UN_SUB() != null) && !id.isInicializada()) {
            throw new ParseCancellationException("Váriavel " + ctx.ID() + " não inicializada Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
        }
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
        return super.visitCommand(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCommandList(EmoteslangParser.CommandListContext ctx) {
        return super.visitCommandList(ctx); //To change body of generated methods, choose Tools | Templates.
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
//        for (EmoteslangParser.DeclarationContext declarationContext : ctx.declaration()) {
//            multidimensional = 0;
//            qtdMultidimensional = 1;
//            TerminalNode id = declarationContext.declarationVar().ID();
//            System.out.println(id);
//        }
        visitChildren(ctx);
        return null;
    }

    @Override
    public Object visitDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx) {
        multidimensional = 1;
        qtdMultidimensional = 1;
        String item = "1";
        if(ctx.arraySize().INT() != null){
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
//            System.out.println("DEVE VERIFICAR OS TIPOS AQUI");
//            verificarCompatibilidadeAtribuicao(ident.getTipo(), ctx);;
        }
        return null;
    }

    @Override
    public Object visitDefaultdes(EmoteslangParser.DefaultdesContext ctx) {
        return super.visitDefaultdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDoWhile(EmoteslangParser.DoWhileContext ctx) {
        return super.visitDoWhile(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFordes(EmoteslangParser.FordesContext ctx) {
        return super.visitFordes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFunctions(EmoteslangParser.FunctionsContext ctx) {
        return super.visitFunctions(ctx); //To change body of generated methods, choose Tools | Templates.
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
        return super.visitExpressionList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIncrementFor(EmoteslangParser.IncrementForContext ctx) {
        return super.visitIncrementFor(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializeArray(EmoteslangParser.InitializeArrayContext ctx) {
        return super.visitInitializeArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializeFor(EmoteslangParser.InitializeForContext ctx) {
        return super.visitInitializeFor(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInitializeMatrix(EmoteslangParser.InitializeMatrixContext ctx) {
        return super.visitInitializeMatrix(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitInputAndOutput(EmoteslangParser.InputAndOutputContext ctx) {
        return super.visitInputAndOutput(ctx); //To change body of generated methods, choose Tools | Templates.
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
                    qtdMultidimensional, // Só aceita unidimensional como parametro... 
                    false);
            tabelaSimbolos.add(id);
        }

        return null;
    }

    @Override
    public Object visitReturndes(EmoteslangParser.ReturndesContext ctx) {
        return super.visitReturndes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSwitchdes(EmoteslangParser.SwitchdesContext ctx) {
        return super.visitSwitchdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWhiledes(EmoteslangParser.WhiledesContext ctx) {
        return super.visitWhiledes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitType(EmoteslangParser.TypeContext ctx) {
        if (ctx.TP_BIN() != null) {
            tipoAtual = Tipo.BINARIO;
        } else if (ctx.TP_BOOL() != null) {
            tipoAtual = Tipo.LOGICO;
        } else if (ctx.TP_DOUBLE() != null) {
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
}
