package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class VariableDeclarationWrapper extends ModiscoASTNodeWrapper {

	public VariableDeclarationWrapper(VariableDeclaration variableDeclaration) {
        super(variableDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from VariableDeclaration not supported");
	}
	
}
