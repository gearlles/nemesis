/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public class Block extends Com {

  private LDecl decl;
  private LCom seq;

  public Block (LDecl decl, LCom seq) {
    this.decl = decl;
    if (decl != null) decl.setParent(this);
    this.seq = seq;
    if (seq != null) seq.setParent(this);
  }

  public LDecl getDecl() {
    return decl;
  }

  public void setDecl(LDecl decl) {
    this.decl = decl;
  }

  public LCom getSeq() {
    return seq;
  }

  public void setSeq(LCom seq) {
    this.seq = seq;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (decl != null) decl.accept(visitor);
    if (seq != null) seq.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (decl != null) decl.traverseTopDown(visitor);
    if (seq != null) seq.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (decl != null) decl.traverseBottomUp(visitor);
    if (seq != null) seq.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Block(\n");
      if (decl != null)
        buffer.append(decl.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (seq != null)
        buffer.append(seq.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Block]");
    return buffer.toString();
  }
}