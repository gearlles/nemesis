/*
 * Generated by classgen, version 1.3
 * 11/12/13 03:36
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class Group extends BCom {

  private Title title;
  private LQuestion lquestion;
  private Weight weight;

  public Group (Title title, LQuestion lquestion, Weight weight) {
    this.title = title;
    if (title != null) title.setParent(this);
    this.lquestion = lquestion;
    if (lquestion != null) lquestion.setParent(this);
    this.weight = weight;
    if (weight != null) weight.setParent(this);
  }

  public Title getTitle() {
    return title;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public LQuestion getLquestion() {
    return lquestion;
  }

  public void setLquestion(LQuestion lquestion) {
    this.lquestion = lquestion;
  }

  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
    if (title != null) title.accept(visitor);
    if (lquestion != null) lquestion.accept(visitor);
    if (weight != null) weight.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (title != null) title.traverseTopDown(visitor);
    if (lquestion != null) lquestion.traverseTopDown(visitor);
    if (weight != null) weight.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (title != null) title.traverseBottomUp(visitor);
    if (lquestion != null) lquestion.traverseBottomUp(visitor);
    if (weight != null) weight.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Group(\n");
      if (title != null)
        buffer.append(title.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (lquestion != null)
        buffer.append(lquestion.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
      if (weight != null)
        buffer.append(weight.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Group]");
    return buffer.toString();
  }
}
