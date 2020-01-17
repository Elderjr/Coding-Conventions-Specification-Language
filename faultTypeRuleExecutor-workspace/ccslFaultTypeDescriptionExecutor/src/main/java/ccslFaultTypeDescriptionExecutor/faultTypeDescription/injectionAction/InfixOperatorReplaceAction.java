package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.Map;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpression;
import org.eclipse.gmt.modisco.java.InfixExpressionKind;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import org.eclipse.gmt.modisco.java.PrefixExpressionKind;

public class InfixOperatorReplaceAction implements InjectionAction {

	private Map<String, String> operatorReplaces;

	public InfixOperatorReplaceAction(Map<String, String> operatorReplaces) {
		this.operatorReplaces = operatorReplaces;
	}

	@Override
	public boolean doAction(ASTNode target) {
		if (target == null) 			
			return false;
		if(target instanceof InfixExpression) {
			InfixExpression exp = (InfixExpression) target;
			String newOperator = operatorReplaces.get(exp.getOperator().getLiteral());
			if (newOperator != null) {
				exp.setOperator(InfixExpressionKind.get(newOperator));
				return true;
			}
		}else if(target instanceof PrefixExpression) {
			PrefixExpression exp = (PrefixExpression) target;
			String newOperator = operatorReplaces.get(exp.getOperator().getLiteral());
			if (newOperator != null) {
				exp.setOperator(PrefixExpressionKind.get(newOperator));
				return true;
			}
		}
		return false;
	}
}
