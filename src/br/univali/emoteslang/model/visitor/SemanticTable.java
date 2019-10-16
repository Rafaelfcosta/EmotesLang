/*
 * Template to help verify type compatibility in a Semantic Analyzer.
 * Available to Computer Science course at UNIVALI.
 */
package br.univali.emoteslang.model.visitor;

import br.univali.emoteslang.model.analise.Identificador;

/**
 *
 * @author rafael
 */
public class SemanticTable {

    public static final int ERR = -1;
    public static final int OK_ = 0;
    public static final int WAR = 1;

    public static final int INT = 0;
    public static final int FLO = 1;
    public static final int CHA = 2;
    public static final int STR = 3;
    public static final int BOO = 4;

    public static final int SUM = 0;
    public static final int SUB = 1;
    public static final int MUL = 2;
    public static final int DIV = 3;
    public static final int REL = 4; // qualquer operador relacional
    public static final int BIT = 5;
    public static final int MOD = 6;
    public static final int LOG = 7;

   // TIPO DE RETORNO DAS EXPRESSOES ENTRE TIPOS
    // 5 x 5 X 5  = TIPO X TIPO X OPER
    private static final int expTable[][][]
            = { /*          INT                 */ /*             FLOAT              */ /*      CHAR                     */ /*    STRING                     */ /*     BOOL        */
                /*INT*/{{INT, INT, INT, FLO, BOO, INT, INT, BOO}, {FLO, FLO, FLO, FLO, BOO, ERR, FLO, BOO}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}},
                /*FLOAT*/ {{FLO, FLO, FLO, FLO, BOO, ERR, INT, BOO}, {FLO, FLO, FLO, FLO, BOO, ERR, FLO, BOO}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}},
                /*CHAR*/ {{ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {STR, ERR, ERR, ERR, BOO, ERR, ERR, BOO}, {STR, ERR, ERR, ERR, BOO, ERR, ERR, BOO}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}},
                /*STRING*/ {{ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {STR, ERR, ERR, ERR, BOO, ERR, ERR, BOO}, {STR, ERR, ERR, ERR, BOO, ERR, ERR, BOO}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}},
                /*BOOL*/ {{ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, ERR, ERR, ERR, ERR}, {ERR, ERR, ERR, ERR, BOO, ERR, ERR, BOO}}
            };

   // atribuicoes compativeis 
    // 5 x 5 = TIPO X TIPO
    static int atribTable[][] = {/* INT FLO CHA STR BOO  */
        /*INT*/{OK_, WAR, ERR, ERR, ERR},
        /*FLO*/ {OK_, OK_, ERR, ERR, ERR},
        /*CHA*/ {ERR, ERR, OK_, ERR, ERR},
        /*STR*/ {ERR, ERR, OK_, OK_, ERR},
        /*BOO*/ {ERR, ERR, ERR, ERR, OK_}
    };

    static int resultType(Identificador.Tipo TP1, Identificador.Tipo TP2, EmotesVisitor.Operation OP) {
        int tp1Code = getTypeCode(TP1);
        int tp2Code = getTypeCode(TP2);
        int opCode = getOpCode(OP);
        return (expTable[tp1Code][tp2Code][opCode]);
    }

    static int atribType(Identificador.Tipo TP1, Identificador.Tipo TP2) {
        int codTp1 = getTypeCode(TP1);
        int codTp2 = getTypeCode(TP2);
        return (atribTable[codTp1][codTp2]);
    }

    public static int getTypeCode(Identificador.Tipo tipo) {
        switch (tipo) {
            case INTEIRO:
            case HEXADECIMAL:
            case BINARIO:
                return INT;
            case CHAR:
                return CHA;
            case LOGICO:
                return BOO;
            case REAL:
                return FLO;
            case STRING:
                return STR;
            default:
                return INT;
        }
    }

    public static int getOpCode(EmotesVisitor.Operation op) {
        switch (op) {
            case SOMA:
                return SUM;
            case SUBTRACAO:
                return SUB;
            case MULTIPLICACAO:
                return MUL;
            case DIVISAO:
                return DIV;
            case MOD:
                return MOD;
            case BITNOT:
            case BITSHIFTLEFT:
            case BITSHIFTRIGHT:
                return BIT;
            case AND:
            case OR:
            case NOT:
                return LOG;
            case MAIOROUIGUAL:
            case MAIORQUE:
            case MENORQUE:
            case MENOROUIGUAL:
            case IDENTICO:
            case DIFERENTE:
                return REL;
        }
        return SUM;
    }
    
    public static Identificador.Tipo getCodeType(int code){
        switch(code){
            case INT:
                return Identificador.Tipo.INTEIRO;
            case CHA:
                return Identificador.Tipo.CHAR;
            case STR:
                return Identificador.Tipo.STRING;
            case FLO:
                return Identificador.Tipo.REAL;
            case BOO:
                return Identificador.Tipo.LOGICO; 
        }
        return Identificador.Tipo.VOID;
    }
}
