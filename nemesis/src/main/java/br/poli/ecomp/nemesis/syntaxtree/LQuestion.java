/*
 * Generated by classgen, version 1.3
 * 11/12/13 03:36
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class LQuestion implements SyntaxNode {

  private SyntaxNode parent;
  private Question question;
  private LQuestion prox;

  public LQuestion (Question question, LQuestion prox) {
    this.question = question;
    if (question != null) question.setParent(this);
    this.prox = prox;
    if (prox != null) prox.setParent(this);
  }

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public LQuestion getProx() {
    return prox;
  }

  public void setProx(LQuestion prox) {
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
    if (question != null) question.accept(visitor);
    if (prox != null) prox.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (question != null) question.traverseTopDown(visitor);
    if (prox != null) prox.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (question != null) question.traverseBottomUp(visitor);
    if (prox != null) prox.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("LQuestion(\n");
      if (question != null)
        buffer.append(question.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (prox != null)
        buffer.append(prox.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [LQuestion]");
    return buffer.toString();
  }
}
