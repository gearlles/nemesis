package Assembler;

public enum OpCode { NOP,
			iPUSH(1)  ,
			iADD, iSUB,	iMUL, iDIV, iMOD, iNEG,

			EQ, NE, LT,	LE, GT, GE,
			AND, OR, NOT, XOR, 
			
			DUP, CHANGE, POP,

			JMP(1), JMP_Z(1), JMP_NZ(1), JMP_P(1), JMP_N(1),
			
			LOAD(1), STORE(1), ILOAD, ISTORE,
			
			PRINT, PRINTLN,
			READ;
			
			int nArgs;
			OpCode() { nArgs = 0; }
			OpCode(int n) { nArgs = n; }
}			
