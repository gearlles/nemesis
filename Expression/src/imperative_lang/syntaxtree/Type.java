/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public abstract class Type implements SyntaxNode {

  private SyntaxNode parent;

  public Type getType() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setType(Type type) {
    throw new ClassCastException("tried to call abstract method");
  }

  public int getSize() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setSize(int size) {
    throw new ClassCastException("tried to call abstract method");
  }

  public Fields getFields() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setFields(Fields fields) {
    throw new ClassCastException("tried to call abstract method");
  }

  public SyntaxNode getParent() {
    return parent;
  }

  public void setParent(SyntaxNode parent) {
    this.parent = parent;
  }

  public abstract void accept(Visitor visitor);
  public abstract void childrenAccept(Visitor visitor);
  public abstract void traverseTopDown(Visitor visitor);
  public abstract void traverseBottomUp(Visitor visitor);
  public String toString() {
    return toString("");
  }

  public abstract String toString(String tab);
}
