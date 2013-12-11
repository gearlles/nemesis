package br.poli.ecomp.nemesis;

import br.poli.ecomp.nemesis.syntaxtree.Answer;
import br.poli.ecomp.nemesis.syntaxtree.BCom;
import br.poli.ecomp.nemesis.syntaxtree.Body;
import br.poli.ecomp.nemesis.syntaxtree.Campi;
import br.poli.ecomp.nemesis.syntaxtree.Content;
import br.poli.ecomp.nemesis.syntaxtree.Course;
import br.poli.ecomp.nemesis.syntaxtree.Declaration;
import br.poli.ecomp.nemesis.syntaxtree.Document;
import br.poli.ecomp.nemesis.syntaxtree.Footer;
import br.poli.ecomp.nemesis.syntaxtree.FreeAnswerQuestion;
import br.poli.ecomp.nemesis.syntaxtree.Group;
import br.poli.ecomp.nemesis.syntaxtree.HCom;
import br.poli.ecomp.nemesis.syntaxtree.Header;
import br.poli.ecomp.nemesis.syntaxtree.LBCom;
import br.poli.ecomp.nemesis.syntaxtree.LContent;
import br.poli.ecomp.nemesis.syntaxtree.LHCom;
import br.poli.ecomp.nemesis.syntaxtree.LNum;
import br.poli.ecomp.nemesis.syntaxtree.LOptions;
import br.poli.ecomp.nemesis.syntaxtree.LQuestion;
import br.poli.ecomp.nemesis.syntaxtree.LSCom;
import br.poli.ecomp.nemesis.syntaxtree.LStatement;
import br.poli.ecomp.nemesis.syntaxtree.LVCom;
import br.poli.ecomp.nemesis.syntaxtree.LiteralDate;
import br.poli.ecomp.nemesis.syntaxtree.Math;
import br.poli.ecomp.nemesis.syntaxtree.MaximumScore;
import br.poli.ecomp.nemesis.syntaxtree.MultipleChoiceQuestion;
import br.poli.ecomp.nemesis.syntaxtree.Option;
import br.poli.ecomp.nemesis.syntaxtree.Professor;
import br.poli.ecomp.nemesis.syntaxtree.Question;
import br.poli.ecomp.nemesis.syntaxtree.RandomOrder;
import br.poli.ecomp.nemesis.syntaxtree.SCom;
import br.poli.ecomp.nemesis.syntaxtree.Settings;
import br.poli.ecomp.nemesis.syntaxtree.Statement;
import br.poli.ecomp.nemesis.syntaxtree.Subject;
import br.poli.ecomp.nemesis.syntaxtree.Text;
import br.poli.ecomp.nemesis.syntaxtree.Title;
import br.poli.ecomp.nemesis.syntaxtree.TrueFalseQuestion;
import br.poli.ecomp.nemesis.syntaxtree.University;
import br.poli.ecomp.nemesis.syntaxtree.VCom;
import br.poli.ecomp.nemesis.syntaxtree.Variable;
import br.poli.ecomp.nemesis.syntaxtree.VariableDate;
import br.poli.ecomp.nemesis.syntaxtree.Variables;
import br.poli.ecomp.nemesis.syntaxtree.Visitor;
import br.poli.ecomp.nemesis.syntaxtree.Weight;

public class Generator implements Visitor {

	StringBuffer dest = new StringBuffer();
	@Override
	public void visit(Document document) {
		dest.append("\\documentclass{article}");
		dest.append("\\usepackage{graphicx}");
		dest.append("\\begin{document}");
		document.getHeader().accept(this);
		document.getSettings().accept(this);
		document.getVariables().accept(this);
		document.getBody().accept(this);
		document.getFooter().accept(this);
	}

	@Override
	public void visit(Header header) {
		
	}

	@Override
	public void visit(LHCom lHCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Settings settings) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LSCom lSCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Variables variables) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LVCom lVCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(VCom vCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Declaration declaration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LNum lNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Body body) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LBCom lBCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LQuestion lQuestion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LOptions lOptions) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LStatement lStatement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Answer answer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LContent lContent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Option option) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Statement statement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Footer footer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Weight weight) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(HCom hCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(University university) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Campi campi) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Subject subject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Title title) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Professor professor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LiteralDate literalDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(VariableDate variableDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(SCom sCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MaximumScore maximumScore) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(RandomOrder randomOrder) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(BCom bCom) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Group group) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Question question) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(MultipleChoiceQuestion multipleChoiceQuestion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(FreeAnswerQuestion freeAnswerQuestion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(TrueFalseQuestion trueFalseQuestion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Content content) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Math math) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Text text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Variable variable) {
		// TODO Auto-generated method stub

	}

}
