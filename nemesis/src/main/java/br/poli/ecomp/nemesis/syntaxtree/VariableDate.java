/*
 * Generated by classgen, version 1.3
 * 11/12/13 01:07
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class VariableDate extends HCom {

  private String var;

  public VariableDate (String var) {
    this.var = var;
  }

  public String getVar() {
    return var;
  }

  public void setVar(String var) {
    this.var = var;
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
    buffer.append("VariableDate(\n");
    buffer.append("  "+tab+var);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [VariableDate]");
    return buffer.toString();
  }
}