package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class VariableDeclarationStatementWrapper extends ModiscoASTNodeWrapper {

	public VariableDeclarationStatementWrapper(VariableDeclarationStatement variableDeclarationStatement) {
        super(variableDeclarationStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from VariableDeclarationStatement not supported");
	}
	
}
