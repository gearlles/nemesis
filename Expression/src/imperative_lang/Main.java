package imperative_lang;
import java.io.*;
import imperative_lang.syntaxtree.*;
import java_cup.runtime.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ALexico lex = new ALexico(new FileInputStream("teste.imp"));
		parser p = new parser(lex);
		
		Symbol prog = p.parse();
		Block blk = (Block)prog.value;
		//System.out.printf("Arvore sintatica : \n%s\n", blk.toString());

		CodeGenerator gen = new CodeGenerator();
		blk.accept(gen);
		System.out.println("Codigo de Maquina: ");
		gen.code.print();
	}

}
