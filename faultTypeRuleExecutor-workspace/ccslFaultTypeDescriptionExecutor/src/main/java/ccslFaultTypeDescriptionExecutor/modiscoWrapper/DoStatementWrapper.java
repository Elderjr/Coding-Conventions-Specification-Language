package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class DoStatementWrapper extends ModiscoASTNodeWrapper {

	public DoStatementWrapper(DoStatement doStatement) {
		super(doStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		DoStatement doStatement = (DoStatement) getASTNode();
		if (doStatement.getBody() == field) {
			return deleteBody(doStatement);
		}
		return false;

	}

	private static boolean deleteBody(DoStatement doStmt) {
		doStmt.setBody(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
		return true;
	}
}
