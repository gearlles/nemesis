/*
 * Generated by classgen, version 1.3
 * 11/12/13 02:54
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class RandomOrder extends SCom {


  public RandomOrder () {
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
    buffer.append("RandomOrder(\n");
    buffer.append(tab);
    buffer.append(") [RandomOrder]");
    return buffer.toString();
  }
}
