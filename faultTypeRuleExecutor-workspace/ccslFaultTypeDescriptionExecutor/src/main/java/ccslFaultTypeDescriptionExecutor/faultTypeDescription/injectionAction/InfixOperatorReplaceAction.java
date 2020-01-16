package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.Map;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.InfixExpressionKind;

public class InfixOperatorReplaceAction implements InjectionAction {

	private Map<String, String> operatorReplaces;

	public InfixOperatorReplaceAction(Map<String, String> operatorReplaces) {
		this.operatorReplaces = operatorReplaces;
	}

	@Override
	public boolean doAction(ASTNode target) {
		if (target == null  || !(target instanceof InfixExpression))
			return false;
		InfixExpression exp = (InfixExpression) target;
		String newOperator = operatorReplaces.get(exp.getOperator().getLiteral());
		if (newOperator != null) {
			exp.setOperator(InfixExpressionKind.get(newOperator));
			return true;
		}
		return false;
	}
}
