package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpression;

public class DeleteInfixOperatorAction implements InjectionAction {

	@Override
	public boolean doAction(ASTNode target) {
		if (target == null  || !(target instanceof InfixExpression))
			return false;
		InfixExpression exp = (InfixExpression) target;
		ASTNode leftOperand = exp.getLeftOperand();
		ActionUtils.setValue(exp, leftOperand);
		return true;
	}

}
