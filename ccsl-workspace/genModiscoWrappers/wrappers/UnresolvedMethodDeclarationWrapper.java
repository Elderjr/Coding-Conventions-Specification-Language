package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedMethodDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedMethodDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedMethodDeclarationWrapper(UnresolvedMethodDeclaration unresolvedMethodDeclaration) {
        super(unresolvedMethodDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedMethodDeclaration not supported");
	}
	
}
