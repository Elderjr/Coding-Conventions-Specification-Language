package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ExpressionStatement;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.DeleteNodeCommand;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ExpressionStatementWrapper extends ModiscoASTNodeWrapper {

	public ExpressionStatementWrapper(ExpressionStatement expressionStatement) {
        super(expressionStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		return new DeleteNodeCommand().doAction(getASTNode());
	}
	
}
