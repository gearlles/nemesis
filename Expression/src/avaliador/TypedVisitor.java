package avaliador;
import java.util.*;
import avaliador.syntaxtree.*;

abstract public class TypedVisitor<R, A> implements Visitor {

	Stack<A> arguments = new Stack<A>();
	Stack<R> results = new Stack<R>();
	
	R accept(Expr e, A arg) {
		arguments.push(arg);
		e.accept(this);
		return results.pop();
	}
	
	public void visit(Expr a) {results.push(visit(a,arguments.pop()));}
	public void visit(Numero a) {results.push(visit(a,arguments.pop()));}
	public void visit(Variavel a) {results.push(visit(a,arguments.pop()));}
	public void visit(Soma a) {results.push(visit(a,arguments.pop()));}
	public void visit(Subtracao a) {results.push(visit(a,arguments.pop()));}
	public void visit(Multiplicacao a) {results.push(visit(a,arguments.pop()));}
	public void visit(Divisao a) {results.push(visit(a,arguments.pop()));}
	public void visit(Potencia a) {results.push(visit(a,arguments.pop()));}
	public void visit(Seno a) {results.push(visit(a,arguments.pop()));}
	public void visit(Cos a) {results.push(visit(a,arguments.pop()));}
	
	abstract R visit(Expr e,A a);
	abstract R visit(Numero e,A a);
	abstract R visit(Variavel e,A a);
	abstract R visit(Soma e,A a);
	abstract R visit(Subtracao e,A a);
	abstract R visit(Multiplicacao e,A a);
	abstract R visit(Divisao e,A a);
	abstract R visit(Potencia e,A a);
	abstract R visit(Seno e,A a);
	abstract R visit(Cos e,A a);
}
