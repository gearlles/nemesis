/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public class Numero extends Expr {

  private int val;

  public Numero (int val) {
    this.val = val;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
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
