package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.deleteNodeHelpers;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.InfixExpression;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionUtils;

public class DeleteInfixContent {

	
	public static boolean deleteInfixExpressionContent(InfixExpression infixExpression, ASTNode field) {
		if(infixExpression.getLeftOperand() == field) {
			return deleteLeftOperand(infixExpression);
		}else if(infixExpression.getRightOperand() == field) {
			return deleteRightOperand(infixExpression);
		}else if(infixExpression.getExtendedOperands().contains(field)) {
			infixExpression.getExtendedOperands().remove(field);
			return true;
		} else {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}

	private static boolean deleteLeftOperand(InfixExpression infixExpression) {
		int extendedOperandsSize = infixExpression.getExtendedOperands().size();
		if(extendedOperandsSize > 0) {
			Expression newLeftOperand = infixExpression.getRightOperand();
			Expression newRightOperand = infixExpression.getExtendedOperands().get(0);
			infixExpression.getExtendedOperands().remove(0);
			infixExpression.setLeftOperand(newLeftOperand);
			infixExpression.setRightOperand(newRightOperand);
			return true;
		} else {
			return ActionUtils.setValue(infixExpression, infixExpression.getRightOperand());
		}
	}

	private static boolean deleteRightOperand(InfixExpression infixExpression) {
		int extendedOperandsSize = infixExpression.getExtendedOperands().size();
		if(extendedOperandsSize > 0) {
			Expression newRightOperand = infixExpression.getExtendedOperands().get(0);
			infixExpression.getExtendedOperands().remove(0);
			infixExpression.setRightOperand(newRightOperand);
			return false;
		} else {
			return ActionUtils.setValue(infixExpression, infixExpression.getLeftOperand());
		}
	}

}
