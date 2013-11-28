package avaliador;
import java_cup.runtime.*;
import java.io.*;
import avaliador.syntaxtree.*;

public class Main {
    public static void main(String args[]) throws Exception {
       ALexico lex = new ALexico(new StringReader("10 + 2*x*2"));
   	   parser s = new parser(lex);
   	   try {
         Symbol exp = s.parse();
         Expr expr = (Expr)exp.value;
         Printer p = new Printer();
         expr.accept(p);
         System.out.printf("Expressao = \n%s\n\n",p.dest.toString());
         
         Derivador der = new Derivador();
         expr.accept(der);
         Expr derivada = der.exprs.pop();
         p = new Printer();
         derivada.accept(p);
         System.out.printf("Derivada da expressao = %s\n",p.dest.toString());
         
         Avaliador av = new Avaliador();
         av.vx = 2;
         expr.accept(av);
         System.out.printf("Valor da expressao = %f\n", av.valores.pop());

         Derivador2 der2 = new Derivador2();
         
         derivada = der2.accept(expr,null);
         p = new Printer();
         derivada.accept(p);
         System.out.printf("Derivada da expressao = %s\n",p.dest.toString());
         
         Avaliador2 av2 = new Avaliador2();
         System.out.printf("Valor da expressao = %f\n", av2.accept(expr, (float)2.));
         
         //expr.accept(new Compilador());
   	   } catch (Throwable ex) {
   		   System.err.printf("Erro :" + ex);
   		   ex.printStackTrace();
   		   
   	   }
    }
}
