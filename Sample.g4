grammar Sample;

prog:  stat+
    ;

stat:  name '=' expr ';'
    ;

expr:  expr ('*' | '/') expr
    |  expr ('+' | '-') expr
    |  INT
    |  '(' expr ')'
    ;

name:  ID
    ;

INT :  ('0'..'9')+
    ;

ID  :  ('a'..'z')+
    ;

WS  :  [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines