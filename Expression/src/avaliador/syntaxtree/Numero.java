/*
 * Generated by classgen, version 1.3
 * 24/10/13 14:00
 */
package avaliador.syntaxtree;

public class Numero extends Expr {

  private float val;

  public Numero (float val) {
    this.val = val;
  }

  public float getVal() {
    return val;
  }

  public void setVal(float val) {
    this.val = val;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Numero(\n");
    buffer.append("  "+tab+val);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Numero]");
    return buffer.toString();
  }
}
