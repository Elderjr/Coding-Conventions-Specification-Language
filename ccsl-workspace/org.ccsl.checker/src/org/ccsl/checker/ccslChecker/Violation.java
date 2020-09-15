package org.ccsl.checker.ccslChecker;

import org.eclipse.modisco.java.ASTNode;

public class Violation {

	private ASTNode nodeViolation;
	private int line;
	
	public Violation(ASTNode nodeViolation, int line) {
		this.nodeViolation = nodeViolation;
		this.line = line;
	}
	
	public String getMessage() {
		return "Violation found in " + nodeViolation.getOriginalCompilationUnit().getOriginalFilePath() +":" + line;
	}
}
