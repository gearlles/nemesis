package Assembler;

public class Instruction {


	
	OpCode op;
	int iArg;
	
	Instruction(OpCode o, int a) {op=o; iArg = a;}
	
	public String toString() {
		if (op.nArgs==1)
			return op.toString() + " " + iArg;
		else
			return op.toString();
	}

}
