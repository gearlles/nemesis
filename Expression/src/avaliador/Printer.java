package avaliador;
import avaliador.syntaxtree.*;
public class Printer implements Visitor {

	StringBuffer dest = new StringBuffer();
	@Override
	public void visit(Expr expr) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Numero numero) {
		dest.append(numero.getVal());
	}

	public void visit(Soma arg) {
		dest.append("(");
		arg.getA().accept(this);
		dest.append("+");
		arg.getB().accept(this);
		dest.append(")");
		
	}
	public void visit(Subtracao arg) {
		dest.append("(");
		arg.getA().accept(this);
		dest.append("-");
		arg.getB().accept(this);
		dest.append(")");
		
	}
	public void visit(Multiplicacao arg) {
		dest.append("(");
		arg.getA().accept(this);
		dest.append("*");
		arg.getB().accept(this);
		dest.append(")");
		
	}
	public void visit(Divisao arg) {
		dest.append("(");
		arg.getA().accept(this);
		dest.append("/");
		arg.getB().accept(this);
		dest.append(")");
		
	}

	public void visit(Potencia arg) {
		dest.append("(");
		arg.getA().accept(this);
		dest.append("^");
		arg.getB().accept(this);
		dest.append(")");
		
	}

	public void visit(Seno arg) {
		dest.append("sen(");
		arg.getA().accept(this);
		dest.append(")");
		
	}
	public void visit(Cos arg) {
		dest.append("cos(");
		arg.getA().accept(this);
		dest.append(")");
		
	}


	@Override
	public void visit(Variavel variavel) {
		dest.append("x");
	}

}
