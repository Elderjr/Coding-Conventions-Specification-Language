package org.ccsl.checker.rule;

public class Rule {

	
	private String ruleName;
	private String ocl;
	
	public Rule(String ruleName, String ocl) {
		this.ruleName = ruleName;
		this.ocl = ocl;
	}
	
	public String getRuleName() {
		return this.ruleName;
	}
	
	public String getOcl() {
		return this.ocl;
	}
}
