package faultTypeRuleExecutor.command.impl;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpression;

import faultTypeRuleExecutor.command.InjectionAction;

public class DeleteInfixOperator implements InjectionAction {

	@Override
	public boolean doAction(ASTNode target) {
		if (target == null)
			return false;
		if (!(target instanceof InfixExpression))
			return false;
		InfixExpression exp = (InfixExpression) target;
		ASTNode leftOperand = exp.getLeftOperand();
		ActionUtils.setValue(exp, leftOperand);
		return true;
	}

}
