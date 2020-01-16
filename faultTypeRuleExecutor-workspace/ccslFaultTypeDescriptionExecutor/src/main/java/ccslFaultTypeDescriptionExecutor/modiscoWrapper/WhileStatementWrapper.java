package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class WhileStatementWrapper extends ModiscoASTNodeWrapper {

	public WhileStatementWrapper(WhileStatement whileStatement) {
		super(whileStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		WhileStatement whileStatement = (WhileStatement) getASTNode();
		if (whileStatement.getBody() == field) {
			return deleteBody(whileStatement);
		}
		throw new UnsupportedOperationException("Method deleteWhileStatementContent not supported");
	}

	private boolean deleteBody(WhileStatement whileStatement) {
		whileStatement.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
		return true;
	}

}
