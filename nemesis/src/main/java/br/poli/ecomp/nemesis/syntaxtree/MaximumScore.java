/*
 * Generated by classgen, version 1.3
 * 11/12/13 02:18
 */
package br.poli.ecomp.nemesis.syntaxtree;

public class MaximumScore extends SCom {

  private float val;

  public MaximumScore (float val) {
    this.val = val;
  }

  public float getVal() {
    return val;
  }

  public void setVal(float val) {
    this.val = val;
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
    buffer.append("MaximumScore(\n");
    buffer.append("  "+tab+val);
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [MaximumScore]");
    return buffer.toString();
  }
}
