package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SwitchStatementWrapper extends ModiscoASTNodeWrapper {

	public SwitchStatementWrapper(SwitchStatement switchStatement) {
		super(switchStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		SwitchStatement switchStatement = (SwitchStatement) getASTNode();
		if (switchStatement.getStatements().contains(field)) {
			switchStatement.getStatements().remove(field);
			return true;
		}
		throw new UnsupportedOperationException("Method deleteSwitchStatementContent not supported");
	}

}
