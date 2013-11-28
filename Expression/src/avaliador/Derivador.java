package avaliador;
import java.util.*;
import avaliador.syntaxtree.*;
public class Derivador implements Visitor {

	Stack<Expr> exprs = new Stack<Expr>();
	public void visit(Expr expr) {
	}

	public void visit(Numero numero) {
		exprs.push(new Numero(0));
	}

	public void visit(Soma arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		Expr db = exprs.pop();
		Expr da = exprs.pop();
		exprs.push(new Soma(da,db));
	}
	public void visit(Subtracao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		Expr db = exprs.pop();
		Expr da = exprs.pop();
		exprs.push(new Subtracao(da,db));
	}

	public void visit(Multiplicacao arg) {
		if (arg.getA() instanceof Numero) {
			arg.getB().accept(this);
			Expr db = exprs.pop();
			exprs.push(new Multiplicacao(arg.getA(),db));
			return;
		}
		arg.getA().accept(this);
		arg.getB().accept(this);
		Expr db = exprs.pop();
		Expr da = exprs.pop();
		exprs.push(new Soma(new Multiplicacao(arg.getA(),db),
							new Multiplicacao(da,arg.getB())));
	}

	public void visit(Divisao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		Expr db = exprs.pop();
		Expr da = exprs.pop();
		exprs.push(new Divisao(new Subtracao(
								   new Multiplicacao(da,arg.getB()),
							       new Multiplicacao(db,arg.getA())
							   ),
							   new Potencia(arg.getB(),new Numero(2))));
	}


	@Override
	public void visit(Potencia potencia) {
		if (potencia.getB() instanceof Numero) {
			potencia.getA().accept(this);
			Expr da = exprs.pop();
			float n = potencia.getB().getVal();
			exprs.push(new Multiplicacao(new Numero(n),
					new Multiplicacao(
							new Potencia(potencia.getA(),new Numero(n-1)),
							da)));
		} else
			throw new RuntimeException("Nao implementado");
		
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
		exprs.push(new Numero(1));
	}

}
