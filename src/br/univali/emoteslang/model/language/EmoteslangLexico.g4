lexer grammar EmoteslangLexico;

fragment LETTER: [a-zA-Z];
fragment NUMBER: [0-9];

//delimitadores de escopo geral
START: 'HeyGuys';
FINISH: 'RIP';

//outras palavras reservadas
RETURN : 'imOut';
FUNCTION: 'TriHard';
READ: 'GivePLZ';
WRITE: 'Bonfire';

//desvios condicionais
IF: 'pikaHi';
ELSE: 'seaPika';
ELSEIF: 'pikaOH';

//lacos de repeticao
SWITCH: 'jerryWhat';
CASE: 'Triggered';
BREAK: 'WaitWhat';
DEFAULT: 'BabyRage';
FOR: '4Head';
WHILE: 'Woah';
DO: 'justDOIT';

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
TRUE: 'CoolCat';
FALSE: 'FatCat';

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
NOT: 'NotLikeThis';

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
DOT_COMMA : 'Clap';
DOUBLE_DOT : ':';
LEFT_SBRACKET : '[';
RIGHT_SBRACKET : ']';
LEFT_PARENTESIS : 'P(';
RIGHT_PARENTESIS : ')G';
LEFT_CBRACKETS : 'Kappa';
RIGHT_CBRACKETS : 'KappaPride';

//comentarios
INLINE_COMMENT: 'Mute' .*? '\n' -> skip;
MULTILINE_COMMENT: 'MonkaW' .*? 'MonkaS' -> skip;

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
