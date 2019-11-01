/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.emoteslang.model.visitor;

import br.univali.emoteslang.model.analise.AssemblyName;
import br.univali.emoteslang.model.analise.Identificador;
import br.univali.emoteslang.model.language.EmoteslangParser;
import java.util.List;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author rafael
 */
public class BipGenerator extends EmotesVisitor {

    private final StringBuilder header = new StringBuilder();
    private final StringBuilder codigo = new StringBuilder();
    private final List<AssemblyName> anlist;
    private int maiorNumTemporariosNecessarios = 0;
    private int numTemporariosNecessarios = 0;
    private int numRotuloAtual = 0;
    private int contEscopo = 1;

    public BipGenerator(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
        this.anlist = AssemblyName.getMatrix(tabelaSimbolos);
        this.codigo.append(".text\n");
        this.geradorData();
    }

    public String getCodigo() {
        String lines[] = this.codigo.toString().split("\n");
        int lastReturn = -2;
        StringBuilder finalCode = new StringBuilder();
        finalCode.append(this.header);
        for (int i = 1; i <= this.maiorNumTemporariosNecessarios; i++) {
            finalCode.append("\t");
            finalCode.append("temp");
            finalCode.append(i);
            finalCode.append(" : 0\n");
        }
        for (int i = 0; i < lines.length; i++) {
            if (i - 1 == lastReturn && lines[i].contains("RETURN")) {
                lines[i] = "";
            }
            if (lines[i].contains("RETURN")) {
                lastReturn = i;
            }
            finalCode.append(lines[i] + "\n");
        }
//        finalCode.append(this.codigo);
        return finalCode.toString();
    }

    private int getOneTemp() {
        this.numTemporariosNecessarios++;
        if (this.maiorNumTemporariosNecessarios < this.numTemporariosNecessarios) {
            this.maiorNumTemporariosNecessarios = this.numTemporariosNecessarios;
        }
        return this.numTemporariosNecessarios;
    }

    private int releaseTheTemp() {
        this.numTemporariosNecessarios--;
        return this.numTemporariosNecessarios;
    }

    private String getOneRot() {
        this.numRotuloAtual++;
        String rot = "rot" + this.numRotuloAtual;
        return rot;
    }

    private void geradorData() {
        this.header.append(".data\n");
        for (Identificador identificador : tabelaSimbolos) {
            if (!identificador.isFuncao()) {
                if (identificador.getTipo() != Identificador.Tipo.INTEIRO) {
                    throw new ParseCancellationException(identificador.getTipo() + " Não suportado pelo BIP");
                }
                this.header.append("\t");
                this.header.append(AssemblyName.findAN(this.anlist, identificador));
                this.header.append(" : ");
                for (int i = 0; i < identificador.getQtdArmazenada(); i++) {
                    if (i == identificador.getQtdArmazenada() - 1) {
                        this.header.append("0\n");
                    } else {
                        this.header.append("0 , ");
                    }
                }
            }
        }
    }

    @Override
    public Object visitProgram(EmoteslangParser.ProgramContext ctx) {
        escopoAtual = Identificador.getUNSAFEId("main", tabelaSimbolos).getEscopo();
        this.codigo.append("\tCALL main\n");
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitTypeWithVoid(EmoteslangParser.TypeWithVoidContext ctx) {
        return super.visitTypeWithVoid(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpression(EmoteslangParser.ExpressionContext ctx) {
        this.primeiraOperacao(ctx);
        int tempNum;
        EmoteslangParser.Op_relContext rel = null;
        for (int i = 1; i < ctx.finalValue().size(); i++) {
            if (ctx.operations(i - 1).op_rel() != null) {
                tempNum = this.getOneTemp();
                this.comando("STO", "temp" + tempNum);
                rel = ctx.operations(i - 1).op_rel();
                this.comando("LDI", ctx.finalValue(i).getText());
            }
            resolveValFinalEOperando(ctx.operations(i - 1), ctx.finalValue(i));
        }
        if (rel != null) {
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            comando("SUB", "temp" + tempNum);
            releaseTheTemp();
            releaseTheTemp();

        }
        return null;
    }

    private void resolveSalto(EmoteslangParser.Op_relContext rel, boolean anti_form, String rot) {
        if (rel.DIFFERENT() != null) {
            if (anti_form) {
                comando("BEQ", rot);
            } else {
                comando("BNE", rot);
            }
        }
        if (rel.EQUALS() != null) {
            if (anti_form) {
                comando("BNE", rot);
            } else {
                comando("BEQ", rot);
            }
        }
        if (rel.BIGGERE() != null) {
            if (anti_form) {
                comando("BLT", rot);
            } else {
                comando("BGE", rot);
            }
        }
        if (rel.BIGGERT() != null) {
            if (anti_form) {
                comando("BLE", rot);
            } else {
                comando("BGT", rot);
            }
        }
        if (rel.SMALLERE() != null) {
            if (anti_form) {
                comando("BGT", rot);
            } else {
                comando("BLE", rot);
            }
        }
        if (rel.SMALLERT() != null) {
            if (anti_form) {
                comando("BGE", rot);
            } else {
                comando("BLT", rot);
            }
        }
    }

    private void resolveValFinalEOperando(EmoteslangParser.OperationsContext opctx, EmoteslangParser.FinalValueContext valctx) {
//        System.out.println("Entrou resolve");
        if (opctx.op_aritmetic() != null) {
            if (opctx.op_aritmetic().ADD() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, true);
            }
        }
        if (opctx.op_bitwise() != null) {
            resolveOpBitwise(opctx.op_bitwise(), valctx);
        }
        if (opctx.op_neg() != null) {
            if (opctx.op_neg().SUB() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, false);
            }
        }
    }

    private void resolveOpBitwise(EmoteslangParser.Op_bitwiseContext opBit, EmoteslangParser.FinalValueContext valctx) {
//        System.out.println("Entrou " + valctx.getText());
        if (valctx.INT() != null) {
            if (opBit.BIT_AND() != null) {
                comando("ANDI", valctx.INT().getSymbol().getText());
            } else if (opBit.BIT_OR() != null) {
                comando("ORI", valctx.INT().getSymbol().getText());
            } else if (opBit.BIT_XOR() != null) {
                comando("XORI", valctx.INT().getSymbol().getText());
            } else if (opBit.BIT_LS() != null) {
                comando("SLL", valctx.INT().getSymbol().getText());
            } else if (opBit.BIT_RS() != null) {
                comando("SRL", valctx.INT().getSymbol().getText());
            } else if (opBit.BIT_NOT() != null) {
                comando("NOT", "0");
            }
            return;
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.array() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
//                for(EmoteslangParser.ExpressionContext exp : valctx.array().arrayIndex().expression()){
//                    visitExpressao(exp);
                visitExpression(valctx.array().arrayIndex().expression());
//                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if (opBit.BIT_AND() != null) {
                    comando("AND", "temp" + tempNum);
                } else if (opBit.BIT_NOT() != null) {
                    comando("NOT", "0");
                } else if (opBit.BIT_OR() != null) {
                    comando("OR", "temp" + tempNum);
                } else if (opBit.BIT_LS() != null) {
                    comando("SLL", "temp" + tempNum);
                } else if (opBit.BIT_RS() != null) {
                    comando("SRL", "temp" + tempNum);
                } else if (opBit.BIT_XOR() != null) {
                    comando("XOR", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                if (opBit.BIT_AND() != null) {
                    comando("AND", varName);
                } else if (opBit.BIT_NOT() != null) {
                    comando("NOT", "0");
                } else if (opBit.BIT_OR() != null) {
                    comando("OR", varName);
                } else if (opBit.BIT_LS() != null) {
                    comando("SLL", varName);
                } else if (opBit.BIT_RS() != null) {
                    comando("SRL", varName);
                } else if (opBit.BIT_XOR() != null) {
                    comando("XOR", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.functionCall() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitFunctionCall(valctx.functionCall());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (opBit.BIT_AND() != null) {
                comando("AND", "temp" + tempNum);
            } else if (opBit.BIT_NOT() != null) {
                comando("NOT", "0");
            } else if (opBit.BIT_OR() != null) {
                comando("OR", "temp" + tempNum);
            } else if (opBit.BIT_LS() != null) {
                comando("SLL", "temp" + tempNum);
            } else if (opBit.BIT_RS() != null) {
                comando("SRL", "temp" + tempNum);
            } else if (opBit.BIT_XOR() != null) {
                comando("XOR", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expression() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpression(valctx.expression());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (opBit.BIT_AND() != null) {
                comando("AND", "temp" + tempNum);
            } else if (opBit.BIT_NOT() != null) {
                comando("NOT", "0");
            } else if (opBit.BIT_OR() != null) {
                comando("OR", "temp" + tempNum);
            } else if (opBit.BIT_LS() != null) {
                comando("SLL", "temp" + tempNum);
            } else if (opBit.BIT_RS() != null) {
                comando("SRL", "temp" + tempNum);
            } else if (opBit.BIT_XOR() != null) {
                comando("XOR", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas" + valctx.getText());

    }

    private void resolveOpAritmeticaMaisOuNegacaoMenos(EmoteslangParser.FinalValueContext valctx, boolean operacaoMais) {
        //ADD ou SUB valor inteiro imediato

//        System.out.println("Exp " + valctx.getText());
        if (valctx.INT() != null) {
            if (operacaoMais) {
                comando("ADDI", valctx.INT().getSymbol().getText());
            } else {
                comando("SUBI", valctx.INT().getSymbol().getText());
            }
            return;
        }

        //Carrega valor de um ID
        if (valctx.ID() != null || valctx.array().ID() != null) {
            if (valctx.array() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
//                for(ExpressaoContext exp : valctx.multidimensional().expressao()){
                visitExpression(valctx.array().arrayIndex().expression());
//                }
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.array().ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if (operacaoMais) {
                    comando("ADD", "temp" + tempNum);
                } else {
                    comando("SUB", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                if (operacaoMais) {
                    comando("ADD", varName);
                } else {
                    comando("SUB", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.functionCall() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitFunctionCall(valctx.functionCall());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expression() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpression(valctx.expression());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas " + valctx.getText());

    }

    private void primeiraOperacao(EmoteslangParser.ExpressionContext ctx) {
        System.out.println("FirstOp: " + ctx.getText());
        EmoteslangParser.FinalValueContext valctx = ctx.finalValue(0);
        //Carregar valor inteiro imediato
        if (valctx.INT() != null) {
            comando("LDI", valctx.INT().getSymbol().getText());
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            //Carregar valor de variavel
            String varName = findAN(valctx.ID().getText()).toString();
            comando("LD", varName);
        } else if (valctx.array() != null) {
            //Carregar valor de vetor
            visitExpression(valctx.array().arrayIndex().expression());

            comando("STO", "$indr");
            comando("LDV", findAN(valctx.array().ID().getSymbol().getText()).toString());
        }

        //Chama função
        if (valctx.functionCall() != null) {
            visitFunctionCall(valctx.functionCall());
        }

        //Resolve outra expressão
        if (valctx.expression() != null) {
//            System.out.println("exp");
            visitExpression(valctx.expression());
        }

        if (ctx.op_neg() != null) {
            if (ctx.op_neg().BIT_NOT() != null) {
                comando("NOT", "0");
            } else if (ctx.op_neg().SUB() != null) {
                reverteSinalAcc();
            }
        }
        System.out.println("Saiu");
    }

    @Override
    public Object visitFinalValue(EmoteslangParser.FinalValueContext ctx) {
        return super.visitFinalValue(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametersCall(EmoteslangParser.ParametersCallContext ctx) {
        for (EmoteslangParser.ExpressionContext expressao : ctx.expression()) {
            visitExpression(expressao);
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
        }
        for (EmoteslangParser.ExpressionContext expressao : ctx.expression()) {
            releaseTheTemp();
        }
        return null;
    }

    @Override
    public Object visitFunctions(EmoteslangParser.FunctionsContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }
        AssemblyName an = findAN(ctx.ID().getText());
        escopoAtual = vaiEscopoFilho(an.getId().getNome());
        this.codigo.append(an.toString());
        this.codigo.append(" : \n");

        if (ctx.parametersList() != null) {
            for (EmoteslangParser.ParameterContext par : ctx.parametersList().parameter()) {
                AssemblyName variavel = findAN(par.ID().getText());
                int tempNum = getOneTemp();
                comando("LD", "temp" + tempNum);
                comando("STO", variavel.toString());
            }
            for (EmoteslangParser.ParameterContext par : ctx.parametersList().parameter()) {
                releaseTheTemp();
            }
        }
        for (EmoteslangParser.CommandsContext command : ctx.commands()) {
            visitCommands(command);
        }
        if (an.toString().equals("main")) {
            this.codigo.append("\tHLT\n");
        } else {
            this.codigo.append("\tRETURN\n");
        }
        retornaEscopoPai();

        return null;
    }

    @Override
    public Object visitAttribution(EmoteslangParser.AttributionContext ctx) {
        AssemblyName variavel;
        if (!(ctx.array() != null)) {
            variavel = findAN(ctx.ID().getText());
        } else {
            variavel = findAN(ctx.array().ID().getText());
        }
        if (variavel == null) {
            System.out.println("Null aqui " + ctx.ID().getText());
        }
        if (ctx.un_op() != null) {
            if (ctx.un_op().UN_ADD() != null) {
                comando("LD", variavel.toString());
                comando("ADDI", "" + 1);
                comando("STO", variavel.toString());
            } else if (ctx.un_op().UN_SUB() != null) {
                comando("LD", variavel.toString());
                comando("SUBI", "" + 1);
                comando("STO", variavel.toString());
            }
        } else if (variavel.getId().getDimensoes() == 0) {
            visitExpression(ctx.expression());
            comando("STO", variavel.toString());
        } else {
            visitExpression(ctx.expression());
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
//            for (EmoteslangParser.ExpressionContext exp : ctx.multidimensional().expressao()) {
//                visitExpressao(exp);
//            }
            visitExpression(ctx.array().arrayIndex().expression());
            //tempNum = getOneTemp();
            //comando("LDI", "temp"+tempNum);
            comando("STO", "$indr");
            comando("LD", "temp" + tempNum);
            releaseTheTemp();
            comando("STOV", variavel.toString());
        }
        return null;
    }

    @Override
    public Object visitFunctionCall(EmoteslangParser.FunctionCallContext ctx) {
        visitParametersCall(ctx.parametersCall());
        if (ctx.ID() == null) {
            System.out.println("???? " + ctx.getText());
        } else {
            String funName = findAN(ctx.ID().getText()).toString();
            comando("CALL", funName);
        }
        return null;
    }

    @Override
    public Object visitIfdes(EmoteslangParser.IfdesContext ctx) {
        return super.visitIfdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCommandList(EmoteslangParser.CommandListContext ctx) {
        List<EmoteslangParser.CommandsContext> commands = ctx.commands();
        for (EmoteslangParser.CommandsContext command : commands) {
            visitCommands(command);
        }
        return super.visitCommandList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCommands(EmoteslangParser.CommandsContext ctx) {
        visitCommand(ctx.command());
        return null;
    }

    @Override
    public Object visitCommand(EmoteslangParser.CommandContext ctx) {
        return super.visitCommand(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitStatements(EmoteslangParser.StatementsContext ctx) {
        visitType(ctx.type());
        return super.visitStatements(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaration(EmoteslangParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclarationVar(EmoteslangParser.DeclarationVarContext ctx) {
        if (ctx.ATTRIBUTION() != null) {
            AssemblyName variavel = findAN(ctx.ID().getText());
            visitExpression(ctx.expression());
            comando("STO", variavel.toString());
        }
        return null;
    }

    @Override
    public Object visitDeclarationArray(EmoteslangParser.DeclarationArrayContext ctx) {
        if (ctx.ATTRIBUTION() != null) {
            AssemblyName variavel = findAN(ctx.ID().getText());
            List<EmoteslangParser.ExpressionContext> expressions = ctx.initializeArray().expressionList().expression();
            int arraySize = Integer.parseInt(ctx.arraySize().getText());
            for (int i = 0; i < arraySize; i++) {
                visitExpression(expressions.get(i));
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LDI", String.valueOf(i));
                comando("STO", "$indr");
                comando("LD", "temp" + tempNum);
                comando("STOV", variavel.toString());
                releaseTheTemp();
            }
        }
        return null;
    }

    @Override
    public Object visitInputAndOutput(EmoteslangParser.InputAndOutputContext ctx) {
        EmoteslangParser.ExpressionContext expGeralAtual;
        for (int i = 0; i < ctx.parametersCall().expression().size(); i++) {
            expGeralAtual = ctx.parametersCall().expression(i);
            String expString = expGeralAtual.getText();
            if (ctx.READ() != null) {
                if (expGeralAtual.finalValue(0).array() != null) {
                    visitExpression(expGeralAtual.finalValue(0).array().arrayIndex().expression());
                    comando("STO", "$indr");
                    comando("LD", "$in_port");
                    comando("STOV", findAN(expGeralAtual.finalValue(0).array().ID().getText()).toString());
                } else {
                    comando("LD", "$in_port");
                    comando("STO", findAN(expGeralAtual.getText()).toString());
                }
            } else if (ctx.WRITE() != null) {
                visitExpression(expGeralAtual);
                comando("STO", "$out_port");
                releaseTheTemp();
            }
        }
        return null;
    }

    private void reverteSinalAcc() {
        int tempNum = getOneTemp();
        comando("STO", "temp" + tempNum);
        comando("LDI", "0");
        comando("SUB", "temp" + tempNum);
        releaseTheTemp();
    }

    private AssemblyName findAN(String name) {
        System.out.println(escopoAtual);
        return AssemblyName.findAN(this.anlist, Identificador.getId(name, tabelaSimbolos, escopoAtual));
    }

    private void comando(String comando, String operador) {
        if (!comando.contains(":")) {
            this.codigo.append("\t");
        }
        this.codigo.append(comando);
        this.codigo.append(" ");
        this.codigo.append(operador);
        this.codigo.append("\n");
    }
}
