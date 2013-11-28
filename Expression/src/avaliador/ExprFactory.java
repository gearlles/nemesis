package avaliador;
import avaliador.syntaxtree.*;
abstract public class ExprFactory {
    abstract Expr numero(Float v);
    abstract Expr soma(Expr a,Expr b);
    abstract Expr subtracao(Expr a,Expr b);
    abstract Expr multiplicacao(Expr a,Expr b);
    abstract Expr divisao(Expr a,Expr b);
    abstract Expr potencia(Expr a,Expr b);
    abstract Expr seno(Expr a);
    abstract Expr cos(Expr a);
    
    Expr multiplicacao(Expr a,Expr b,Expr c) {
    	return multiplicacao(a,multiplicacao(b,c));
    }

}
