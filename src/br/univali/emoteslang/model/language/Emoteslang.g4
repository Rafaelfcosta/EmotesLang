grammar Emoteslang;

import EmoteslangLexico;

program 
    :   START LEFT_CBRACKETS 
        statements* functions+ RIGHT_CBRACKETS 
        FINISH
    ;

statements
    :  type declaration (',' declaration)* DOT_COMMA?;

declaration
    : declarationVar | declarationArray | declarationMatrix ;

declarationVar
    : ID (ATTRIBUTION expression)?;

declarationMatrix
    : ID LEFT_SBRACKET matrixLine RIGHT_SBRACKET LEFT_SBRACKET matrixCol RIGHT_SBRACKET (ATTRIBUTION initializeMatrix)?;

initializeMatrix
    : LEFT_CBRACKETS initializeArray (',' initializeArray)* RIGHT_CBRACKETS;

declarationArray
    : ID LEFT_SBRACKET arraySize RIGHT_SBRACKET (ATTRIBUTION initializeArray)?;

initializeArray
    : LEFT_CBRACKETS expressionList? RIGHT_CBRACKETS;

matrixLine
    : arraySize;

matrixCol
    : arraySize;

arraySize
    : INT | ID;

arrayIndex
    : LEFT_SBRACKET expression RIGHT_SBRACKET;

functions
    : (FUNCTION typeWithVoid ID LEFT_PARENTESIS parametersList? RIGHT_PARENTESIS 
                            LEFT_CBRACKETS commands* RIGHT_CBRACKETS);

parametersList
    : parameter (',' parameter)*;

parameter
    : type BIT_AND? ID (paramArray | paramMatrix)?;

paramArray
    : LEFT_SBRACKET expression RIGHT_SBRACKET;

paramMatrix
    : LEFT_SBRACKET expression RIGHT_SBRACKET LEFT_SBRACKET expression RIGHT_SBRACKET;

inputAndOutput: (READ | WRITE) LEFT_PARENTESIS parametersCall RIGHT_PARENTESIS;

functionCall: ID LEFT_PARENTESIS parametersCall RIGHT_PARENTESIS;

parametersCall: (expression (',' expression)*)?;

commands: (conditionals | command) ;

command
    :
    ( 
        statements
    |   returndes
    |   breakdes
    |   attribution
    |   functionCall
    |   expression
    |   inputAndOutput
    )   DOT_COMMA?
    ;

conditionals
    :
        ifdes
    |   whiledes
    |   doWhile DOT_COMMA?
    |   fordes
    |   switchdes
    ;

ifdes
    : IF LEFT_PARENTESIS expression RIGHT_PARENTESIS commandList (ifdeselse | ifdeselseif )?;

ifdeselse
    : ELSE commandList;

ifdeselseif
    : ELSEIF ifdes;

whiledes
    : WHILE LEFT_PARENTESIS expression RIGHT_PARENTESIS commandList;

doWhile
    : DO commandList WHILE LEFT_PARENTESIS expression RIGHT_PARENTESIS;

fordes
    : FOR LEFT_PARENTESIS initializeFor? DOT_COMMA condition DOT_COMMA incrementFor RIGHT_PARENTESIS commandList;

switchdes
    : SWITCH LEFT_PARENTESIS expression RIGHT_PARENTESIS LEFT_CBRACKETS casedes* defaultdes? RIGHT_CBRACKETS;

casedes
    : CASE expression ':' (commands* | LEFT_CBRACKETS commands* RIGHT_CBRACKETS) breakdes?;

defaultdes
    : DEFAULT ':' commands (breakdes)?;

breakdes
    : BREAK;

returndes
    : RETURN expression?;

commandList
    : (LEFT_CBRACKETS commands* RIGHT_CBRACKETS | commands);

initializeFor
    : 
        attribution
    |   statements
    ;

//precisa de atribuicao composta?
incrementFor
    : expression | attribution;

condition
    : expression;

array
    : ID arrayIndex;

matrix
    : ID arrayIndex arrayIndex;

attribution
    : (ID | array | matrix) ATTRIBUTION expression;

expression
    : 
        ADD expression
    |   SUB expression
    |   NOT expression
    |   BIT_NOT expression
    |   ID (arrayIndex arrayIndex?)? UN_ADD
    |   ID (arrayIndex arrayIndex?)? UN_SUB
    |   UN_ADD ID (arrayIndex arrayIndex?)?
    |   UN_SUB ID (arrayIndex arrayIndex?)?
    |   expression MULT expression
    |   expression DIV expression
    |   expression MOD expression
    |   expression ADD expression
    |   expression SUB expression
    |   expression EQUALS expression
    |   expression DIFFERENT expression
    |   expression BIGGERT expression
    |   expression SMALLERT expression
    |   expression SMALLERE expression
    |   expression BIGGERE expression
    |   expression AND expression
    |   expression OR expression
    |   expression BIT_XOR expression
    |   expression BIT_LS expression
    |   expression BIT_RS expression
    |   expression BIT_AND expression
    |   expression BIT_OR expression
    |   finalValue
    ;

finalValue: 
        ID
    |   (INT | HEXA | BIN)
    |   DOUBLE
    |   FLOAT
    |   BOOLEAN
    |   CHAR
    |   STRING
    |   array
    |   matrix
    |   LEFT_PARENTESIS expression RIGHT_PARENTESIS
    ;

typeWithVoid: TP_VOID | type;
type: TP_INT | TP_BIN | TP_HEX | TP_DOUBLE | TP_FLOAT | TP_CHAR | TP_STRING | TP_BOOL;

expressionList
    : (expression) (',' (expression))*;