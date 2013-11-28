package avaliador;
import java_cup.runtime.*;
%%
%cup
%public
%class ALexico
%{
%}
%eofval{
    return new Symbol(sym.EOF);
%eofval}

%%
"+" { return new Symbol(sym.SOMA); }
"*" { return new Symbol(sym.PROD); }
"-" { return new Symbol(sym.DIFE); }
"/" { return new Symbol(sym.DIVI); }
"^" { return new Symbol(sym.ELEV); }
"sen" { return new Symbol(sym.SEN); }
"cos" { return new Symbol(sym.COS); }
"x"  { return new Symbol(sym.VAR); }
"(" { return new Symbol(sym.A); }
")" { return new Symbol(sym.F); }
[0-9]+("."[0-9]+)? { return new Symbol(sym.NUM, new Float(yytext())); }
[ \n\t\r\f] { /* ignora espaços e saltos de linha */ }