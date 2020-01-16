package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedClassDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedClassDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedClassDeclarationWrapper(UnresolvedClassDeclaration unresolvedClassDeclaration) {
        super(unresolvedClassDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedClassDeclaration not supported");
	}
	
}
