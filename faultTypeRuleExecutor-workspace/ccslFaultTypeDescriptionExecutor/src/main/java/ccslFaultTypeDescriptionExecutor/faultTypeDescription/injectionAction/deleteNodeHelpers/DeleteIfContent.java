package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.deleteNodeHelpers;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionUtils;

public class DeleteIfContent {

	
	public static boolean deleteIfContent(IfStatement ifStatement, ASTNode field) {
		if (ifStatement.getThenStatement() == field) {
			return deleteThen(ifStatement);
		} else if (ifStatement.getElseStatement() == field) {
			return deleteElse(ifStatement);
		}
		throw new IllegalArgumentException(field + "is not a field of IfStatement");
	}

	private static boolean deleteThen(IfStatement ifStmt) {
		ifStmt.setThenStatement(JavaPackage.eINSTANCE.getJavaFactory().createEmptyStatement());
		return true;
	}

	private static boolean deleteElse(IfStatement ifStmt) {
		ifStmt.setElseStatement(null);
		return true;
	}

}
