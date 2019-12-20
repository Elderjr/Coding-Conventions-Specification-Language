package faultTypeRuleExecutor.command.impl;

import java.util.Map;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.InfixExpressionKind;

import faultTypeRuleExecutor.command.InjectionAction;

public class InfixOperatorReplace implements InjectionAction {

	private Map<String, String> operatorReplaces;

	public InfixOperatorReplace(Map<String, String> operatorReplaces) {
		this.operatorReplaces = operatorReplaces;
	}

	@Override
	public void doAction(ASTNode target) {
		if (target == null)
			return;
		if (!(target instanceof InfixExpression))
			return;
		InfixExpression exp = (InfixExpression) target;
		String newOperator = operatorReplaces.get(exp.getOperator().getLiteral());
		if (newOperator != null) {
			exp.setOperator(InfixExpressionKind.get(newOperator));
		}
	}
}
