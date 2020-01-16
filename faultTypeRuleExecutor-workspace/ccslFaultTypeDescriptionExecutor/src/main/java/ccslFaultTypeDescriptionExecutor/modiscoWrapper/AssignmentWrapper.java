package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.ExpressionStatement;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionUtils;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.DeleteNodeCommand;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AssignmentWrapper extends ModiscoASTNodeWrapper {

	public AssignmentWrapper(Assignment assignment) {
        super(assignment);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		Assignment assignment = (Assignment) getASTNode();
		if(assignment.getRightHandSide() == field) {
			return deleteRightHandSide(assignment);
		} else {
			throw new IllegalArgumentException(field + " is not a field of " + assignment);
		}
	}

	private boolean deleteRightHandSide(Assignment assignment) {
		if (assignment.eContainer() != null && assignment.eContainer() instanceof ASTNode) {
			ASTNode container = (ASTNode) assignment.eContainer();
			if (container instanceof ExpressionStatement) {
				return new DeleteNodeCommand().doAction(assignment);
			} else {
				return ActionUtils.setValue(assignment, assignment.getLeftHandSide());
			}
		}
		return false;
	}
}
