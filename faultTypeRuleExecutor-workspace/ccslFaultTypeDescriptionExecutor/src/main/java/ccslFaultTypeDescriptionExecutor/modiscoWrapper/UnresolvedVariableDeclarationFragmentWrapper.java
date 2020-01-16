package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedVariableDeclarationFragment;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedVariableDeclarationFragmentWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedVariableDeclarationFragmentWrapper(UnresolvedVariableDeclarationFragment unresolvedVariableDeclarationFragment) {
        super(unresolvedVariableDeclarationFragment);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedVariableDeclarationFragment not supported");
	}
	
}
