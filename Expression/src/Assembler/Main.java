package Assembler;
import static  Assembler.OpCode.*;
public class Main {

	public static void main(String args[]) {
		Bytecode code = new Bytecode();
		code.add(iPUSH,0);
		code.add(STORE,1);
		code.add(READ);
		code.add(LOAD,1);
		code.add(iADD);
		code.add(DUP);
		code.add(STORE,1);
		code.add(PRINTLN);
		code.add(JMP,2);
		
		code.print();
	}
	
}
