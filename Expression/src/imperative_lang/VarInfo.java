package imperative_lang;
import imperative_lang.syntaxtree.*;
public class VarInfo {

	int startAddress;
	Type type;
	VarInfo(int start, Type t) {
		startAddress = start;
		type = t;
	}
	
}
