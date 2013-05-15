grammar Sample;

prog:  stat+
    ;

stat:  ID '=' expr ';'
    ;

expr:  expr ('*' | '/') expr
    |  expr ('+' | '-') expr
    |  INT
    |  '(' expr ')'
    ;

INT :  ('0'..'9')+
    ;

ID  :  ('a'..'z')+
    ;

WS  :  [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines