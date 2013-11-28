package avaliador;
import java.util.*;
import avaliador.syntaxtree.*;

public class Avaliador implements Visitor {
    //Map<String,Float> vars;
	Stack<Float> valores = new Stack<Float>();
	public void visit(Expr expr) {
	}

	public void visit(Numero numero) {
		valores.push(numero.getVal());
	}

	public void visit(Soma arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		float vb = valores.pop();
		float va = valores.pop();
		valores.push(va+vb);
	}

	public void visit(Subtracao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		float vb = valores.pop();
		float va = valores.pop();
		valores.push(va-vb);
	}

	public void visit(Multiplicacao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		float vb = valores.pop();
		float va = valores.pop();
		valores.push(va*vb);
	}

	public void visit(Divisao arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		float vb = valores.pop();
		float va = valores.pop();
		valores.push(va/vb);
	}

	public void visit(Potencia arg) {
		arg.getA().accept(this);
		arg.getB().accept(this);
		float vb = valores.pop();
		float va = valores.pop();
		valores.push((float)Math.pow(va,vb));
		
	}

	@Override
	public void visit(Seno seno) {
		seno.getA().accept(this);
		float va = valores.pop();
		valores.push((float)Math.sin(va));
		
	}

	@Override
	public void visit(Cos cos) {
		cos.getA().accept(this);
		float va = valores.pop();
		valores.push((float)Math.cos(va));
		
	}
	
	float vx;
	public void visit(Variavel variavel) {
		valores.push(vx);
	}

}
