package faultType.impl;

import command.InjectionCommand;
import command.impl.DeleteNodeCommand;
import faultType.FaultType;

public class RemoveElseBlocks implements FaultType {

	public String getOcl() {
		return "Block.allInstances()->select(block1 |\n" + "  --Scope Conditions\n"
				+ "  let ifStatement2: OclAny = block1.oclContainer() in (not ifStatement2.oclIsUndefined()) and\n"
				+ "  ifStatement2.oclIsKindOf(IfStatement) and\n"
				+ "  ifStatement2.oclAsType(IfStatement).elseStatement = block1\n" + ")";
	}

	public InjectionCommand getAction() {
		return new DeleteNodeCommand();
	}

}
