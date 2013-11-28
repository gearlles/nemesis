package avaliador;
import java_cup.runtime.*;
import java.io.*;
import avaliador.syntaxtree.*;

public class Main2 {
    public static void main(String args[]) throws Exception {
       ALexico lex = new ALexico(new StringReader("10 + 2*5*2"));
   	   parser s = new parser(lex);
   	   try {
         Symbol exp = s.parse();
         Expr expr = (Expr)exp.value;
         Printer p = new Printer();
         expr.accept(p);
         System.out.printf("Expressao = \n%s\n\n",p.dest.toString());

         Compilador comp = new Compilador();
         expr.accept(comp);
         comp.program.print();
   	   } catch (Throwable ex) {
   		   System.err.printf("Erro :" + ex);
   		   ex.printStackTrace();
   		   
   	   }
    }
}
