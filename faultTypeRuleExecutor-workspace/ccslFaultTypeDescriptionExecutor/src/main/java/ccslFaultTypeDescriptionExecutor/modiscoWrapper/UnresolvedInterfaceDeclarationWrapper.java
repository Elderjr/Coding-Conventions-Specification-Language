package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedInterfaceDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedInterfaceDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedInterfaceDeclarationWrapper(UnresolvedInterfaceDeclaration unresolvedInterfaceDeclaration) {
        super(unresolvedInterfaceDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedInterfaceDeclaration not supported");
	}
	
}
