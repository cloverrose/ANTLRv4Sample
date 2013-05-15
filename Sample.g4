grammar Sample;

prog:  stat+
    ;

stat:  exprAssign
    |  formulaAssign
    ;

exprAssign
    :  ID '=' expr ';'
    ;

formulaAssign
    :  ID '=' formula ';'
    ;

expr:  expr ('*' | '/') expr
    |  expr ('+' | '-') expr
    |  INT
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
    |  '(' formula ')'
    ;


INT :  ('0'..'9')+
    ;

ID  :  ('a'..'z')+
    ;

WS  :  [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines