package imperative_lang;
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
"."  { return new Symbol(sym.PONTO,yytext()); }
"+"  { return new Symbol(sym.OP1,yytext()); }
"-"  { return new Symbol(sym.OP1,yytext()); }
"*"  { return new Symbol(sym.OP2,yytext()); }
"/"  { return new Symbol(sym.OP2,yytext()); }
"==" { return new Symbol(sym.OP3,yytext()); }
"!=" { return new Symbol(sym.OP3,yytext()); }
"<"  { return new Symbol(sym.OP3,yytext()); }
">"  { return new Symbol(sym.OP3,yytext()); }
">=" { return new Symbol(sym.OP3,yytext()); }
"<"  { return new Symbol(sym.OP3,yytext()); }
"&&" { return new Symbol(sym.OP4,yytext()); }
"||" { return new Symbol(sym.OP4,yytext()); }
"if" { return new Symbol(sym.IF); }
"int" { return new Symbol(sym.INT); }
"bool" { return new Symbol(sym.BOOL); }
"struct" { return new Symbol(sym.STRUCT); }
"while" { return new Symbol(sym.WHILE); }
"then" { return new Symbol(sym.THEN); }
"else" { return new Symbol(sym.ELSE); }
[a-z]+  { return new Symbol(sym.VAR,yytext()); }
";" { return new Symbol(sym.PV); }
"=" { return new Symbol(sym.EQ); }
"(" { return new Symbol(sym.A_P); }
")" { return new Symbol(sym.F_P); }
"{" { return new Symbol(sym.A_CHAVE); }
"}" { return new Symbol(sym.F_CHAVE); }
"[" { return new Symbol(sym.A_COLCH); }
"]" { return new Symbol(sym.F_COLCH); }
"^" { return new Symbol(sym.POINTER); }
[0-9]+ { return new Symbol(sym.NUM, new Integer(yytext())); }
[ \n\t\r\f] { /* ignora espaços e saltos de linha */ }