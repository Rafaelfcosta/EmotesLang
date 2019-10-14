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
 * @author rafae
 */
public class EmotesSemanticVisitor extends EmotesVisitor {

    public EmotesSemanticVisitor(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
    }

    public List<Identificador> getTabelaSimbolos() {
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

        return super.visitAttribution(ctx); //To change body of generated methods, choose Tools | Templates.
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
        return super.visitCommands(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCondition(EmoteslangParser.ConditionContext ctx) {
        return super.visitCondition(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitConditionals(EmoteslangParser.ConditionalsContext ctx) {
        return super.visitConditionals(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaration(EmoteslangParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx) {
        return super.visitDeclarationArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationMatrix(EmoteslangParser.DeclarationMatrixContext ctx) {
        return super.visitDeclarationMatrix(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationVar(EmoteslangParser.DeclarationVarContext ctx) {
        return super.visitDeclarationVar(ctx); //To change body of generated methods, choose Tools | Templates.
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
        return super.visitIfdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressionList(EmoteslangParser.ExpressionListContext ctx) {
        return super.visitExpressionList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfdeselseif(EmoteslangParser.IfdeselseifContext ctx) {
        return super.visitIfdeselseif(ctx); //To change body of generated methods, choose Tools | Templates.
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
    public Object visitParamArray(EmoteslangParser.ParamArrayContext ctx) {
//        multidimensional = ctx.LEFT_SBRACKET();
        qtdMultidimensional = 1;
        for (int i = 0; i < multidimensional; i++) {
//            qtdMultidimensional *= Integer.parseInt(item);
        }
        return null;
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
        for(int i = 0; i< ctx.parameter().size(); i++){
            String idName = ctx.parameter(i).ID().getSymbol().getText();
            if(Escopo.verificaSeExisteNoEscopo(idName, tabelaSimbolos, escopoAtual)){
                throw new ParseCancellationException("Declaração de Váriavel " + idName + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());
            }
            multidimensional = 0;
            qtdMultidimensional = 1;
            if(ctx.parameter(i).paramArray() != null){
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
    public Object visitProgram(EmoteslangParser.ProgramContext ctx) {
        escopoAtual = new Escopo("programa");
        markAllFunctions(ctx);
        visitChildren(ctx);
        return tabelaSimbolos;
    }

    @Override
    public Object visitReturndes(EmoteslangParser.ReturndesContext ctx) {
        return super.visitReturndes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStatements(EmoteslangParser.StatementsContext ctx) {
        visitType(ctx.type());
        for (EmoteslangParser.DeclarationContext declarationContext : ctx.declaration()) {
            multidimensional = 0;
            qtdMultidimensional = 1;
            TerminalNode id = declarationContext.declarationVar().ID();
            System.out.println(id);
        }
        return super.visitStatements(ctx); //To change body of generated methods, choose Tools | Templates.
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
//            while (ctx.ID() != null) {
            visitTypeWithVoid(ctx.typeWithVoid());
            System.out.println(ctx.ID().getSymbol().getText());
            if (Escopo.verificaSeExisteNoEscopo(ctx.ID().getSymbol().getText(), tabelaSimbolos, escopoAtual)) {
//                this.semanticErrors.add(new ParseCancellationException("Declaração da Função " + ctx.ID().getSymbol().getText() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine()));;
//                throw new ParseCancellationException("Declaração de Funcao " + ctx.ID().getSymbol().getText() + " já existe neste escopo Linha: " + ctx.start.getLine() + " Coluna: " + ctx.start.getCharPositionInLine());;
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
//            visitParametersList(ctx.parametersList());
            retornaEscopoPai();
        }
    }
}
