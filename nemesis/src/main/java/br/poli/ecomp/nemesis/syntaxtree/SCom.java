/*
 * Generated by classgen, version 1.3
 * 11/12/13 03:36
 */
package br.poli.ecomp.nemesis.syntaxtree;

public abstract class SCom implements SyntaxNode {

  private SyntaxNode parent;

  public float getVal() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setVal(float val) {
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
