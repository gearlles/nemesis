/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public class TPointer extends Type {

  private Type type;

  public TPointer (Type type) {
    this.type = type;
    if (type != null) type.setParent(this);
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (type != null) type.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (type != null) type.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (type != null) type.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("TPointer(\n");
      if (type != null)
        buffer.append(type.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [TPointer]");
    return buffer.toString();
  }
}