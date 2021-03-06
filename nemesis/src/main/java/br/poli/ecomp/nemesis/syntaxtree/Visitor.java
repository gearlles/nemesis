/*
 * Generated by classgen, version 1.3
 * 11/12/13 03:36
 */
package br.poli.ecomp.nemesis.syntaxtree;

public interface Visitor {

  public void visit(Document document);
  public void visit(Header header);
  public void visit(LHCom lHCom);
  public void visit(Settings settings);
  public void visit(LSCom lSCom);
  public void visit(Variables variables);
  public void visit(LVCom lVCom);
  public void visit(VCom vCom);
  public void visit(Declaration declaration);
  public void visit(LNum lNum);
  public void visit(Body body);
  public void visit(LBCom lBCom);
  public void visit(LQuestion lQuestion);
  public void visit(LOptions lOptions);
  public void visit(LStatement lStatement);
  public void visit(Answer answer);
  public void visit(LContent lContent);
  public void visit(Option option);
  public void visit(Statement statement);
  public void visit(Footer footer);
  public void visit(Weight weight);
  public void visit(HCom hCom);
  public void visit(University university);
  public void visit(Campi campi);
  public void visit(Course course);
  public void visit(Subject subject);
  public void visit(Title title);
  public void visit(Professor professor);
  public void visit(LiteralDate literalDate);
  public void visit(VariableDate variableDate);
  public void visit(SCom sCom);
  public void visit(MaximumScore maximumScore);
  public void visit(RandomOrder randomOrder);
  public void visit(BCom bCom);
  public void visit(Group group);
  public void visit(Question question);
  public void visit(MultipleChoiceQuestion multipleChoiceQuestion);
  public void visit(FreeAnswerQuestion freeAnswerQuestion);
  public void visit(TrueFalseQuestion trueFalseQuestion);
  public void visit(Content content);
  public void visit(Math math);
  public void visit(Text text);
  public void visit(Variable variable);

}
