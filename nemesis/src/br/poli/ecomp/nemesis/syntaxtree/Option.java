/*
 * Generated by classgen, version 1.3
 * 11/12/13 01:44
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class Option implements SyntaxNode {

  private SyntaxNode parent;
  private String text;

  public Option (String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
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
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Option(\n");
    buffer.append("  "+tab+text);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Option]");
    return buffer.toString();
  }
}