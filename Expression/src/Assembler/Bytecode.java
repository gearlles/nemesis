package Assembler;
import java.util.*;
import static Assembler.OpCode.*;

public class Bytecode {

	Vector<Instruction> program = new Vector<Instruction>();
	
	public Bytecode() {
		
	}
	
	void add(Instruction i) {program.add(i); }
	public void add(OpCode o) {add(new Instruction(o,0));}
	public void add(OpCode o,int arg) {add(new Instruction(o,arg));}
	
	public void push(int v) {add(iPUSH,v); }
	public void iadd() {add(iADD); }
	public void isub() {add(iSUB); }
	public void imul() {add(iMUL); }
	public void idiv() {add(iDIV); }
	public void load(int p) {add(LOAD,p);}
	public void store(int p) {add(STORE,p);}
	
	public void jump(Label l) {
		Instruction i = new Instruction(JMP,-1);
		add(i);
		l.addDependencies(i);
	}
	public void jump_nz(Label l) {
		Instruction i = new Instruction(JMP_NZ,-1);
		add(i);
		l.addDependencies(i);
	}
	public void jump_z(Label l) {
		Instruction i = new Instruction(JMP_Z,-1);
		add(i);
		l.addDependencies(i);
	}
	public void setLabel(Label l) {
		l.setAddress(program.size());
	}
	
	public void print() {
		for (int c=0;c<program.size();c++)
			System.out.printf("%4d %s\n", c, program.elementAt(c).toString());
	}
	
	void run() {
		
	}
}
