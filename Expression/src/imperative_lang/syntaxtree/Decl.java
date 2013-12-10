/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public class Decl implements SyntaxNode {

  private SyntaxNode parent;
  private Type type;
  private String nome;
  private Expr start;

  public Decl (Type type, String nome, Expr start) {
    this.type = type;
    if (type != null) type.setParent(this);
    this.nome = nome;
    this.start = start;
    if (start != null) start.setParent(this);
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Expr getStart() {
    return start;
  }

  public void setStart(Expr start) {
    this.start = start;
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
    if (type != null) type.accept(visitor);
    if (start != null) start.accept(visitor);
  }

  public void traverseTopDown(Visitor visitor) {
    accept(visitor);
    if (type != null) type.traverseTopDown(visitor);
    if (start != null) start.traverseTopDown(visitor);
  }

  public void traverseBottomUp(Visitor visitor) {
    if (type != null) type.traverseBottomUp(visitor);
    if (start != null) start.traverseBottomUp(visitor);
    accept(visitor);
  }

  public String toString() {
    return toString("");
  }

  public String toString(String tab) {
    StringBuffer buffer = new StringBuffer();
    buffer.append(tab);
    buffer.append("Decl(\n");
      if (type != null)
        buffer.append(type.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append("  "+tab+nome);
    buffer.append("\n");
      if (start != null)
        buffer.append(start.toString("  "+tab));
      else
        buffer.append(tab+"  null");
    buffer.append("\n");
    buffer.append(tab);
    buffer.append(") [Decl]");
    return buffer.toString();
  }
}