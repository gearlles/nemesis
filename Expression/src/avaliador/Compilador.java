package avaliador;
import java.util.*;
import avaliador.syntaxtree.*;
import Assembler.*;
import static Assembler.OpCode.*;

public class Compilador implements Visitor {

	Bytecode program = new Bytecode();
	
	public void visit(Expr expr) {
	}

	public void visit(Numero numero) {
		program.add(iPUSH,(int)numero.getVal());
	}

	public void visit(Soma arg) { 
		arg.getA().accept(this);
		arg.getB().accept(this);
		program.add(iADD);
	}

	public void visit(Subtracao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		program.add(iSUB);
	}

	public void visit(Multiplicacao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		program.add(iMUL);
	}

	public void visit(Divisao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		program.add(iDIV);
	}

	@Override
	public void visit(Potencia potencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Seno seno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Cos cos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Variavel variavel) {
		// TODO Auto-generated method stub
		
	}

}
