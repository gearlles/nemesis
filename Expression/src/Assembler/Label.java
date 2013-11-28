package Assembler;
import java.util.*;
public class Label {
	int address = -1;
	Vector<Instruction> dependencies = null;
	
	void addDependencies(Instruction i) {
		if (address==-1) {
			if (dependencies==null) dependencies = new Vector<Instruction>();
			dependencies.add(i);
		} else
			i.iArg = address;
	}
	
	void setAddress(int addr) {
		address = addr;
		if (dependencies!=null) {
			for (Instruction i : dependencies) {
				i.iArg = addr;
			}
			dependencies = null;
		}
	}

}
