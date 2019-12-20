package faultTypeRuleExecutor.command.impl;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpression;

import faultTypeRuleExecutor.command.InjectionAction;

public class DeleteInfixOperator implements InjectionAction {

	@Override
	public void doAction(ASTNode target) {
		if (target == null)
			return;
		if (!(target instanceof InfixExpression))
			return;
		InfixExpression exp = (InfixExpression) target;
		ASTNode leftOperand = exp.getLeftOperand();
		ActionUtils.setValue(exp, leftOperand);
	}

}
