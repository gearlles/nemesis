/*
 * Generated by classgen, version 1.3
 * 27/11/13 14:42
 */
package imperative_lang.syntaxtree;

public interface Visitor {

  public void visit(LDecl lDecl);
  public void visit(Decl decl);
  public void visit(Fields fields);
  public void visit(LCom lCom);
  public void visit(Expr expr);
  public void visit(Numero numero);
  public void visit(Op op);
  public void visit(Variavel variavel);
  public void visit(Array array);
  public void visit(Field field);
  public void visit(Reference reference);
  public void visit(DeReference deReference);
  public void visit(Com com);
  public void visit(Assign assign);
  public void visit(CIf cIf);
  public void visit(CWhile cWhile);
  public void visit(Block block);
  public void visit(Type type);
  public void visit(TInt tInt);
  public void visit(TBool tBool);
  public void visit(TArray tArray);
  public void visit(TStruct tStruct);
  public void visit(TPointer tPointer);

}
