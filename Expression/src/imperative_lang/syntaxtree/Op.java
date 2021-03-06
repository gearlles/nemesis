/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public class Op extends Expr {

  private Expr a;
  private String op;
  private Expr b;

  public Op (Expr a, String op, Expr b) {
    this.a = a;
    if (a != null) a.setParent(this);
    this.op = op;
    this.b = b;
    if (b != null) b.setParent(this);
  }

  public Expr getA() {
    return a;
  }

  public void setA(Expr a) {
    this.a = a;
  }

  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public Expr getB() {
    return b;
  }

  public void setB(Expr b) {
    this.b = b;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (a != null) a.accept(visitor);
    if (b != null) b.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (a != null) a.traverseTopDown(visitor);
    if (b != null) b.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (a != null) a.traverseBottomUp(visitor);
    if (b != null) b.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Op(\n");
      if (a != null)
        buffer.append(a.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append("  "+tab+op);
    buffer.append("\n");
      if (b != null)
        buffer.append(b.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Op]");
    return buffer.toString();
  }
}
