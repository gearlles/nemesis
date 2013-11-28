package avaliador;
import avaliador.syntaxtree.*;
public class Avaliador2 extends TypedVisitor<Float, Float> {

	Float visit(Expr e, Float a) {
		return (float)0.;
	}

	@Override
	Float visit(Numero e, Float a) {
		return e.getVal();
	}

	Float visit(Variavel e, Float a) {
		return a;
	}

	Float visit(Soma e, Float a) {
		return accept(e.getA(),a)+accept(e.getB(),a);
	}
	Float visit(Subtracao e, Float a) {
		return accept(e.getA(),a)-accept(e.getB(),a);
	}
	Float visit(Multiplicacao e, Float a) {
		return accept(e.getA(),a)*accept(e.getB(),a);
	}
	Float visit(Divisao e, Float a) {
		return accept(e.getA(),a)/accept(e.getB(),a);
	}
	Float visit(Potencia e, Float a) {
		return (float)Math.pow(accept(e.getA(),a),accept(e.getB(),a));
	}
	Float visit(Seno e, Float a) {
		return (float)Math.sin(accept(e.getA(),a));
	}
	Float visit(Cos e, Float a) {
		return (float)Math.cos(accept(e.getA(),a));
	}

}
