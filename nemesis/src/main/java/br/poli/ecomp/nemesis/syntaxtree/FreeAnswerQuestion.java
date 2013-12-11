/*
 * Generated by classgen, version 1.3
 * 11/12/13 03:00
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class FreeAnswerQuestion extends Question {

  private Title title;
  private Weight weight;
  private Answer answer;

  public FreeAnswerQuestion (Title title, Weight weight, Answer answer) {
    this.title = title;
    if (title != null) title.setParent(this);
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
    if (weight != null) weight.accept(visitor);
    if (answer != null) answer.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (title != null) title.traverseTopDown(visitor);
    if (weight != null) weight.traverseTopDown(visitor);
    if (answer != null) answer.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (title != null) title.traverseBottomUp(visitor);
    if (weight != null) weight.traverseBottomUp(visitor);
    if (answer != null) answer.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("FreeAnswerQuestion(\n");
      if (title != null)
        buffer.append(title.toString("  "+tab));
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
    buffer.append(") [FreeAnswerQuestion]");
    return buffer.toString();
  }
}
