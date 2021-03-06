/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public class LCom implements SyntaxNode {

  private SyntaxNode parent;
  private Com com;
  private LCom prox;

  public LCom (Com com, LCom prox) {
    this.com = com;
    if (com != null) com.setParent(this);
    this.prox = prox;
    if (prox != null) prox.setParent(this);
  }

  public Com getCom() {
    return com;
  }

  public void setCom(Com com) {
    this.com = com;
  }

  public LCom getProx() {
    return prox;
  }

  public void setProx(LCom prox) {
    this.prox = prox;
  }

  public SyntaxNode getParent() {
    return parent;
  }

  public void setParent(SyntaxNode parent) {
    this.parent = parent;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (com != null) com.accept(visitor);
    if (prox != null) prox.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (com != null) com.traverseTopDown(visitor);
    if (prox != null) prox.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (com != null) com.traverseBottomUp(visitor);
    if (prox != null) prox.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("LCom(\n");
      if (com != null)
        buffer.append(com.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (prox != null)
        buffer.append(prox.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [LCom]");
    return buffer.toString();
  }
}
