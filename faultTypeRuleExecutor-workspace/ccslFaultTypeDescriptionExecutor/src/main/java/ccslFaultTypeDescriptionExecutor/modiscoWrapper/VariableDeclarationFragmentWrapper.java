package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class VariableDeclarationFragmentWrapper extends ModiscoASTNodeWrapper {

	public VariableDeclarationFragmentWrapper(VariableDeclarationFragment variableDeclarationFragment) {
        super(variableDeclarationFragment);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from VariableDeclarationFragment not supported");
	}
	
}
