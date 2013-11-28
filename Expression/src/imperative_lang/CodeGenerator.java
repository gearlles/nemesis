package imperative_lang;

import java.util.*;
import Assembler.*;
import imperative_lang.syntaxtree.*;

public class CodeGenerator implements Visitor {

	Bytecode code = new Bytecode();
	
	// indica como uma expressão deve ser avaliada:
	// 		True: a expressão empilha o valor da expressão
	//      False: a expressão empilha o endereço de memória de uma l-expr
	boolean calculeValue;  
	
	public void visit(Expr expr) {}
	public void visit(Com com) {}

	
	@Override
	public void visit(Numero numero) {
		assert(calculeValue=true);
		code.push(numero.getVal());
	}

	@Override
	public void visit(Op op) {
		assert(calculeValue=true);
		op.getA().accept(this);
		op.getB().accept(this);
		if (op.getOp().equals("+"))
			code.iadd();
		if (op.getOp().equals("=="))
			code.add(OpCode.EQ);
	}
	
	public void visit(Variavel variavel) {
		VarInfo info = declaredVariables.get(variavel.getNome());
		if (info==null) throw new RuntimeException("Variavel " + variavel.getNome() + " nao declarada");
		if (calculeValue)
			code.load(info.startAddress);
		else
			code.push(info.startAddress);
	}
	public void visit(Array array) {
		boolean oldCalculeValue = calculeValue;
		calculeValue = false;
		array.getArray().accept(this);
		calculeValue = true;
		array.getIndex().accept(this);
		Type t = typeof(array.getArray());
		if (!(t instanceof TArray)) 
			throw new RuntimeException("Not array");
		code.push(sizeof(t.getType()));
		code.imul();
		code.iadd();
		
		calculeValue = oldCalculeValue;
		if (calculeValue)
			code.add(OpCode.ILOAD);
		
	}
	public void visit(Field field) {
	}
	public void visit(Reference reference) {
	}
	public void visit(DeReference deReference) {
	}

	public void visit(Assign assign) {
		int pos;
		calculeValue = false;
		assign.getLeft().accept(this);
		calculeValue = true;
		assign.getRight().accept(this);
		code.add(OpCode.ISTORE);
	}

	public void visit(CIf cIf) {
		Label lElse = new Label();
		Label lFimSe = new Label();
		cIf.getTest().accept(this);
		code.jump_z(lElse);
		cIf.getCaseTrue().accept(this);
		code.jump(lFimSe);
		code.setLabel(lElse);
		cIf.getCaseFalse().accept(this);
		code.setLabel(lFimSe);
	}

	@Override
	public void visit(CWhile cWhile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Block block) {
		block.getDecl().accept(this);
		block.getSeq().accept(this);
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(LCom lCom) {
		lCom.getCom().accept(this);
		if (lCom.getProx()!=null) lCom.getProx().accept(this);
	}


	Map<String,VarInfo> declaredVariables = new HashMap<String,VarInfo>();
	int lastFreePosition = 1;
	public void visit(LDecl lDecl) {
		lDecl.getDecl().accept(this);
		if (lDecl.getProx()!=null) lDecl.getProx().accept(this);
		
	}
	@Override
	public void visit(Decl decl) {
		String name = decl.getNome();
		Type t = decl.getType();
		if (declaredVariables.containsKey(name)) 
			throw new RuntimeException("Variavel " + name + " ja declarada");
		System.out.printf("Alocando variavel %s no endereco %d\n", name,lastFreePosition);
		declaredVariables.put(name,  new VarInfo(lastFreePosition,t));
		lastFreePosition += sizeof(t);
	}

	
	Type TInt_singletom = new TInt();
	Type TBool_singletom = new TBool();
	
	Type typeof(Expr e) {
		if (e instanceof Numero) return TInt_singletom;
		if (e instanceof Variavel) {
			VarInfo info = declaredVariables.get(e.getNome());
			if (info==null) throw new RuntimeException("Variavel "+ e.getNome() + " nao declarada");
			return info.type;
		}
		if (e instanceof Array) {
			Type t2 = typeof(e.getArray());
			if (t2 instanceof TArray) 
				return t2.getType();
			else
				return null;
		}
		return null;
	}
	int sizeof(Type t) {
		if (t instanceof TInt) return 4;
		if (t instanceof TBool) return 1;
		if (t instanceof TPointer) return 4;
		if (t instanceof TArray) return t.getSize()*sizeof(t.getType());
		if (t instanceof TStruct) {
			Fields fs = t.getFields();
			int size;
			for (size=0;fs!=null;fs=fs.getProx())
				size += sizeof(fs.getType());
			return size;
		}
		return 0;
	}
	
	public void visit(Fields fields) {}
	public void visit(Type type) {}
	public void visit(TInt tInt) {}
	public void visit(TBool tBool) {}
	public void visit(TArray tArray) {}
	public void visit(TStruct tStruct) {}
	public void visit(TPointer tPointer) {}

}
