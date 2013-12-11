/*
 * Generated by classgen, version 1.3
 * 11/12/13 01:44
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class TrueFalseQuestion extends Question {

  private Title title;
  private LStatement lstatement;
  private Weight weight;
  private Answer answer;

  public TrueFalseQuestion (Title title, LStatement lstatement, Weight weight, Answer answer) {
    this.title = title;
    if (title != null) title.setParent(this);
    this.lstatement = lstatement;
    if (lstatement != null) lstatement.setParent(this);
    this.weight = weight;
    if (weight != null) weight.setParent(this);
    this.answer = answer;
    if (answer != null) answer.setParent(this);
  }

  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public LStatement getLstatement() {
    return lstatement;
  }

  public void setLstatement(LStatement lstatement) {
    this.lstatement = lstatement;
  }

  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public Answer getAnswer() {
    return answer;
  }

  public void setAnswer(Answer answer) {
    this.answer = answer;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (title != null) title.accept(visitor);
    if (lstatement != null) lstatement.accept(visitor);
    if (weight != null) weight.accept(visitor);
    if (answer != null) answer.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (title != null) title.traverseTopDown(visitor);
    if (lstatement != null) lstatement.traverseTopDown(visitor);
    if (weight != null) weight.traverseTopDown(visitor);
    if (answer != null) answer.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (title != null) title.traverseBottomUp(visitor);
    if (lstatement != null) lstatement.traverseBottomUp(visitor);
    if (weight != null) weight.traverseBottomUp(visitor);
    if (answer != null) answer.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("TrueFalseQuestion(\n");
      if (title != null)
        buffer.append(title.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (lstatement != null)
        buffer.append(lstatement.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (weight != null)
        buffer.append(weight.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (answer != null)
        buffer.append(answer.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [TrueFalseQuestion]");
    return buffer.toString();
  }
}
