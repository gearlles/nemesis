package avaliador;
import avaliador.syntaxtree.*;
public class DefaultFactory extends ExprFactory {

	public Expr numero(Float v) {
		return new Numero(v);
	}

	@Override
	public Expr soma(Expr a, Expr b) {
		return new Soma(a,b);
	}

	@Override
	public Expr subtracao(Expr a, Expr b) {
		return new Subtracao(a,b);
	}

	public Expr multiplicacao(Expr a, Expr b) {
		return new Multiplicacao(a,b);
	}

	public Expr divisao(Expr a, Expr b) {
		return new Divisao(a,b);
	}

	public Expr potencia(Expr a, Expr b) {
		return new Potencia(a,b);
	}

	@Override
	public Expr seno(Expr a) {
		return new Seno(a);
	}

	@Override
	public Expr cos(Expr a) {
		return new Cos(a);
	}

}
