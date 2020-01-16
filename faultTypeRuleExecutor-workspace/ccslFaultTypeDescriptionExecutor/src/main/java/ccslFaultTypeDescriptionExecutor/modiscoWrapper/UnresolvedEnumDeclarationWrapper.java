package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedEnumDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedEnumDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedEnumDeclarationWrapper(UnresolvedEnumDeclaration unresolvedEnumDeclaration) {
        super(unresolvedEnumDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedEnumDeclaration not supported");
	}
	
}
