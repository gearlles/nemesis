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
"$footer"									{ return new Symbol(sym.FOOTER); }
"$header"									{ return new Symbol(sym.HEADER); }
"$settings"									{ return new Symbol(sym.SETTINGS); }
"$variables"								{ return new Symbol(sym.VARIABLES); }
"$body"										{ return new Symbol(sym.BODY); }
"$university"  								{ return new Symbol(sym.UNIVERSITY); }
"$campi"  									{ return new Symbol(sym.CAMPI); }
"$course"  									{ return new Symbol(sym.COURSE); }
"$subject"									{ return new Symbol(sym.SUBJECT); }
"$title"									{ return new Symbol(sym.TITLE); }
"$date"										{ return new Symbol(sym.DATE); }
"$professor"								{ return new Symbol(sym.PROFESSOR); }
"$maximumScore"								{ return new Symbol(sym.MAXIMUMSCORE); }
"$group"									{ return new Symbol(sym.GROUP); }
"$multipleChoiceQuestion"					{ return new Symbol(sym.MULTIPLECHOICEQUESTION); }
"$option"									{ return new Symbol(sym.OPTION); }
"$answer"									{ return new Symbol(sym.ANSWER); }
"$weight"									{ return new Symbol(sym.WEIGHT); }
"$freeAnswerQuestion"						{ return new Symbol(sym.FREEANSWERQUESTION); }
"$data"										{ return new Symbol(sym.DATA); }
"$content"									{ return new Symbol(sym.CONTENT); }
"$solver"									{ return new Symbol(sym.SOLVER); }
"$code"										{ return new Symbol(sym.CODE); }
"$math"										{ return new Symbol(sym.MATH); }
"$trueFalseQuestion"						{ return new Symbol(sym.TRUEFALSEQUESTION); }
"$statement"								{ return new Symbol(sym.STATEMENT); }
"{" 										{ return new Symbol(sym.OPENBRACKET); }
"}" 										{ return new Symbol(sym.CLOSEBRACKET); }
[0-9]+("."[0-9]+)? 							{ return new Symbol(sym.NUMBER, new Float(yytext())); }
@{1}[a-zA-Z]+[0-9]*							{ return new Symbol(sym.VARIABLE); }
"\"{1}[\w .,;!?:\(\)\[\]\{\}]*\"{1}"		{ return new Symbol(sym.STRING); }
[ \n\t\r\f] 								{ /* ignora espaços e saltos de linha */ }
"/\\*.*\\*/"								{ /* ignora comentários */}
