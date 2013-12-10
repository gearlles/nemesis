package nemesis.avaliador;
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
"$header"		{ return new Symbol(sym.HEADER); }
"$university"  	{ return new Symbol(sym.UNIVERSITY); }
"$campi"  		{ return new Symbol(sym.CAMPI); }
"$course"  		{ return new Symbol(sym.COURSE); }
"$subject"		{ return new Symbol(sym.SUBJECT); }
"$title"		{ return new Symbol(sym.TITLE); }
"$date"			{ return new Symbol(sym.DATE); }
"$professor"	{ return new Symbol(sym.PROFESSOR); }
"$maximumScore"	{ return new Symbol(sym.MAXIMUMSCORE); }
"$multipleChoiceQuestion"	{ return new Symbol(sym.MULTIPLECHOICEQUESTION); }
"$option"				{ return new Symbol(sym.OPTION); }
"$answer"				{ return new Symbol(sym.ANSWER); }
"$weight"				{ return new Symbol(sym.WEIGHT); }
"$freeAnswerQuestion"	{ return new Symbol(sym.FREEANSWERQUESTION); }
"$subQuestion"			{ return new Symbol(sym.SUBQUESTION); }
"$solve"				{ return new Symbol(sym.SOLVE); }
"$content"				{ return new Symbol(sym.CONTENT); }
"$solver"				{ return new Symbol(sym.SOLVER); }
"$code"					{ return new Symbol(sym.CODE); }
"$trueFalseQuestion"	{ return new Symbol(sym.TRUEFALSEQUESTION); }
"$statement"			{ return new Symbol(sym.STATEMENT); }
"$footer"				{ return new Symbol(sym.FOOTER); }
"{" 					{ return new Symbol(sym.OPENBRACKET); }
"}" 					{ return new Symbol(sym.CLOSEBRACKET); }
"$math"					{ return new Symbol(sym.MATH); }
"+" 		{ return new Symbol(sym.SUM); }
"*" 		{ return new Symbol(sym.MULTIPLICATION); }
"-" 		{ return new Symbol(sym.DIFFERENCE); }
"/" 		{ return new Symbol(sym.DIVISION); }
"$sen" 		{ return new Symbol(sym.SIN); }
"$cos" 		{ return new Symbol(sym.COS); }
"$pow" 		{ return new Symbol(sym.EXPONENTIATION); }
"$sqrt" 	{ return new Symbol(sym.SQUAREROOT); }
"(" 		{ return new Symbol(sym.OPENPARENTHESES); }
")" 		{ return new Symbol(sym.CLOSEPARENTHESES); }
[0-9]+("."[0-9]+)? 		{ return new Symbol(sym.NUMBER, new Float(yytext())); }
@{1}[a-zA-Z]+[0-9]*		{ return new Symbol(sym.VARIABLE); }
"{1}[\w .,;!?:\(\)\[\]\{\}]*"{1}		{ return new Symbol(sym.STRING); }
[ \n\t\r\f] 			{ /* ignora espaços e saltos de linha */ }
"/\\*.*\\*/"				{ /* ignora comentários */}