/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */

package imperative_lang.syntaxtree;

public interface SyntaxNode {

  public void accept(Visitor visitor);

  public void childrenAccept(Visitor visitor);
  public void traverseBottomUp(Visitor visitor);
  public void traverseTopDown(Visitor visitor);

  public SyntaxNode getParent();
  public void setParent(SyntaxNode parent);
}
