package command.impl;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.IfStatement;
import command.InjectionAction;

/**
 * MiaAction perfoms MissingIfConstructionAroundStatements action.
 * In other words, this class delete an If Statements but keeps the "thenStatement" in the code.
 * @author elder
 *
 */
public class MiaAction implements InjectionAction {

	@Override
	public void doCommand(ASTNode node) {
		validateNode(node);
		IfStatement ifStmt = (IfStatement) node;
		Block block = (Block) ifStmt.eContainer();
		int ifIndex = block.getStatements().indexOf(ifStmt);
		block.getStatements().remove(ifIndex);
		block.getStatements().add(ifStmt.getThenStatement());
	}

	private void validateNode(ASTNode node) {
		if (node instanceof IfStatement) {
			IfStatement ifStmt = (IfStatement) node;
			if (ifStmt.getElseStatement() == null) {
				return;
			} else {
				throw new RuntimeException("MiaAction only handle IfStatement objects without else statements");
			}
		} else {
			throw new RuntimeException("MiaAction only handle IfStatement objects");
		}
	}

}
