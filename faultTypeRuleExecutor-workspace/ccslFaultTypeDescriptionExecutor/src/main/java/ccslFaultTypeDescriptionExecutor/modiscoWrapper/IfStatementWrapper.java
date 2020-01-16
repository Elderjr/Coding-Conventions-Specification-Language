package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionUtils;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class IfStatementWrapper extends ModiscoASTNodeWrapper {

	public IfStatementWrapper(IfStatement ifStatement) {
		super(ifStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		IfStatement ifStatement = (IfStatement) getASTNode();
		if (ifStatement.getThenStatement() == field) {
			return deleteThen(ifStatement);
		} else if (ifStatement.getElseStatement() == field) {
			return deleteElse(ifStatement);
		}
		throw new UnsupportedOperationException("Method deleteWhileStatementContent not supported");
	}

	private boolean deleteThen(IfStatement ifStmt) {
		ActionUtils.setValue(ifStmt, JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
		return true;
	}

	private boolean deleteElse(IfStatement ifStmt) {
		ifStmt.setElseStatement(null);
		return true;
	}

}
