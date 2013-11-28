package avaliador;
import avaliador.syntaxtree.*;
public class Derivador2 extends TypedVisitor<Expr, Void> {

	ExprFactory fac = new DefaultFactory();
	
	Expr visit(Expr e, Void a) {
		return null;
	}

	Expr visit(Numero e, Void a) {
		return fac.numero((float)0);
	}

	Expr visit(Variavel e, Void a) {
		return fac.numero((float)1.);
	}

	Expr visit(Soma e, Void a) {
		return fac.soma(accept(e.getA(),null),accept(e.getB(),null));
	}

	Expr visit(Subtracao e, Void a) {
		return fac.subtracao(accept(e.getA(),null),accept(e.getB(),null));
	}

	Expr visit(Multiplicacao e, Void a) {
		return fac.soma(new Multiplicacao(accept(e.getA(),null),e.getB()),
				new Multiplicacao(accept(e.getB(),null),e.getA()));
	}

	Expr visit(Divisao e, Void a) {
		// TODO Auto-generated method stub
		return null;
	}

	Expr visit(Potencia e, Void a) {
		if (e.getB() instanceof Numero) {
			Expr ex = e.getA();
			Expr dex = accept(ex,null);
			float val = e.getB().getVal();
			return fac.multiplicacao(new Numero(val),
					new Potencia(ex,new Numero(val-1)), dex);
		}
		return null;
	}

	@Override
	Expr visit(Seno e, Void a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Expr visit(Cos e, Void a) {
		// TODO Auto-generated method stub
		return null;
	}

}
