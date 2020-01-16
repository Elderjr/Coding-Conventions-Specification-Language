package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedTypeDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedTypeDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedTypeDeclarationWrapper(UnresolvedTypeDeclaration unresolvedTypeDeclaration) {
        super(unresolvedTypeDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedTypeDeclaration not supported");
	}
	
}
