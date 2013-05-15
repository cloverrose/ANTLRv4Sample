grammar Sample;

prog:  stat+
    ;

stat:  exprAssign
    |  formulaAssign
    |  tupleAssign
    ;

exprAssign
    :  ID '=' expr ';'
    ;

formulaAssign
    :  ID '=' formula ';'
    ;

tupleAssign
    :   ID '=' '(' (element (',' element)*)? ')' ';'
    ;

element
    :   expr
    |   formula
    ;

expr:  expr ('*' | '/') expr
    |  expr ('+' | '-') expr
    |  INT
    |  ID
    |  '(' expr ')'
    ;

formula
    :  '!' formula
    |  formula '&&' formula
    |  formula '->' formula
    |  formula '||' formula
    |  formula '<->' formula
    |  'true'
    |  'false'
    |  ID
    |  '(' formula ')'
    ;


INT :  ('0'..'9')+
    ;

ID  :  ('a'..'z')+
    ;

WS  :  [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines