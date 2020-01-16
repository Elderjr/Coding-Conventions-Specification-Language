package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class EnhancedForStatementWrapper extends ModiscoASTNodeWrapper {

	public EnhancedForStatementWrapper(EnhancedForStatement enhancedForStatement) {
		super(enhancedForStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		EnhancedForStatement enhancedForStatement = (EnhancedForStatement) getASTNode();
		if (enhancedForStatement.getBody() == field) {
			return deleteBody(enhancedForStatement);
		}
		throw new UnsupportedOperationException("Method deleteWhileStatementContent not supported");
	}

	private boolean deleteBody(EnhancedForStatement forStmt) {
		forStmt.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
		return true;
	}
}
