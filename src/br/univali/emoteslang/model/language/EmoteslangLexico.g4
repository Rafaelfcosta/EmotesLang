lexer grammar EmoteslangLexico;

fragment LETTER: [a-zA-Z];
fragment NUMBER: [0-9];

//delimitadores de escopo geral
START: 'go';
FINISH: 'stop';

//outras palavras reservadas
RETURN : 'return';
FUNCTION: 'function';
READ: 'read';
WRITE: 'write';

//desvios condicionais
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';

//lacos de repeticao
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
DEFAULT: 'default';
FOR: 'for';
WHILE: 'while';
DO: 'do';

//nomes de tipos de dados
TP_INT: 'int';
TP_BIN: 'bin';
TP_HEX: 'hex';
TP_DOUBLE: 'double';
TP_FLOAT: 'float';
TP_CHAR: 'char';
TP_STRING: 'string';
TP_BOOL: 'boolean';
TP_VOID: 'void';

BOOLEAN: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';

//operadores unarios
UN_ADD : '++';
UN_SUB : '--';

//operadores relacionais
BIGGERT : '>';
SMALLERT : '<';
BIGGERE : '>=';
SMALLERE : '<=';
EQUALS : '==';
DIFFERENT : '!=';

//Operadores logicos
AND : '&&';
OR : '||';
NOT: '!';

//Operador bit a bit
BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
BIT_NOT : '~';
BIT_RS : '>>';
BIT_LS : '<<';

ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
MOD : '%';

ATTRIBUTION : '=';
DOT : '.';
COMMA : ',';
DOT_COMMA : ';';
DOUBLE_DOT : ':';
LEFT_SBRACKET : '[';
RIGHT_SBRACKET : ']';
LEFT_PARENTESIS : '(';
RIGHT_PARENTESIS : ')';
LEFT_CBRACKETS : '{';
RIGHT_CBRACKETS : '}';

//comentarios
INLINE_COMMENT: '//' .*? '\n' -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

//espacos em branco
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;

//variaveis
ID : (LETTER | '_') (LETTER | NUMBER | '_' )* ;


//identificacao de valores constantes
INT : NUMBER+ ;
DOUBLE : NUMBER+ '.' NUMBER+ ;
FLOAT : NUMBER+ '.' NUMBER+ ('F' | 'f');
CHAR : '\'' .? '\'';
STRING: '"'(~["\\]|'\\'.)*'"';
BIN : '0b'[01]+;
HEXA : '0x' (NUMBER | [A-Fa-f])+;
