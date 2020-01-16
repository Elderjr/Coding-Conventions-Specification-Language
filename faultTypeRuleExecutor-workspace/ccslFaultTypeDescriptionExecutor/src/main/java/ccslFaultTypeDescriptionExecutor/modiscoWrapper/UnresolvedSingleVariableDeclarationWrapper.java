package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedSingleVariableDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedSingleVariableDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedSingleVariableDeclarationWrapper(UnresolvedSingleVariableDeclaration unresolvedSingleVariableDeclaration) {
        super(unresolvedSingleVariableDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedSingleVariableDeclaration not supported");
	}
	
}
