/*
 * Generated by classgen, version 1.3
 * 11/12/13 01:44
 */
package br.poli.ecomp.nemesis.syntaxtree;

public abstract class Question extends BCom implements SyntaxNode {

  private SyntaxNode parent;

  public Title getTitle() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setTitle(Title title) {
    throw new ClassCastException("tried to call abstract method");
  }

  public LOptions getOptions() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setOptions(LOptions options) {
    throw new ClassCastException("tried to call abstract method");
  }

  public Weight getWeight() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setWeight(Weight weight) {
    throw new ClassCastException("tried to call abstract method");
  }

  public Answer getAnswer() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setAnswer(Answer answer) {
    throw new ClassCastException("tried to call abstract method");
  }

  public LStatement getLstatement() {
    throw new ClassCastException("tried to call abstract method");
  }

  public void setLstatement(LStatement lstatement) {
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
