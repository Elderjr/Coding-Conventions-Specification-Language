package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ForStatementWrapper extends ModiscoASTNodeWrapper {

	public ForStatementWrapper(ForStatement forStatement) {
		super(forStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		ForStatement forStatement = (ForStatement) getASTNode();
		if (forStatement.getBody() == field) {
			return deleteBody(forStatement);
		}
		throw new UnsupportedOperationException("Method deleteWhileStatementContent not supported");
	}

	private boolean deleteBody(ForStatement forStmt) {
		forStmt.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
		return true;
	}

}
