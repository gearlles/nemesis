/*
 * Generated by classgen, version 1.3
 * 11/12/13 03:00
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class Text extends Content {

  private String text;

  public Text (String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public void childrenAccept(Visitor visitor) {
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    accept(visitor);
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Text(\n");
    buffer.append("  "+tab+text);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Text]");
    return buffer.toString();
  }
}
