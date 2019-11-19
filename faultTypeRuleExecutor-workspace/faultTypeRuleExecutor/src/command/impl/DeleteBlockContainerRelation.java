package command.impl;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Statement;

import command.InjectionCommand;

public class DeleteBlockContainerRelation implements InjectionCommand {

	@Override
	public void doCommand(ASTNode node) {
		Block targetBlock = (Block) node;
		ASTNode tmpBlock = targetBlock;
		ASTNode tmpBlockBefore = null;
		do {
			tmpBlockBefore = tmpBlock;
			tmpBlock = (ASTNode) tmpBlock.eContainer();
		} while (tmpBlock != null && !(tmpBlock instanceof Block));
		new DeleteNodeCommand().doCommand(targetBlock);
		int index = ((Block) tmpBlock).getStatements().indexOf(tmpBlockBefore);
		((Block) tmpBlock).getStatements().add(index + 1, targetBlock);
	}

}
