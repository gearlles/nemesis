/*
 * Generated by classgen, version 1.3
 * 24/10/13 14:00
 */
package avaliador.syntaxtree;

public interface Visitor {

  public void visit(Expr expr);
  public void visit(Numero numero);
  public void visit(Soma soma);
  public void visit(Subtracao subtracao);
  public void visit(Multiplicacao multiplicacao);
  public void visit(Divisao divisao);
  public void visit(Potencia potencia);
  public void visit(Seno seno);
  public void visit(Cos cos);
  public void visit(Variavel variavel);

}
