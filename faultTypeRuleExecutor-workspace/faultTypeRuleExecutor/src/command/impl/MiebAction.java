package command.impl;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.IfStatement;

import command.InjectionCommand;

/**
 * MiebAction perfoms MissingIfConstructPlusStatementsBeforeElse action.
 * In other words, this class delete an If Statements but keeps the "elseStatement" in the code.
 * @author elder
 *
 */
public class MiebAction implements InjectionCommand {

	@Override
	public void doCommand(ASTNode node) {
		validateNode(node);
		IfStatement ifStmt = (IfStatement) node;
		Block block = (Block) ifStmt.eContainer();
		int ifIndex = block.getStatements().indexOf(ifStmt);
		block.getStatements().remove(ifIndex);
		block.getStatements().add(ifStmt.getElseStatement());
	}

	private void validateNode(ASTNode node) {
		if (node instanceof IfStatement) {
			return;
		} else {
			throw new RuntimeException("Mieb action only handle IfStatement objects");
		}
	}

}
