package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class InterfaceDeclarationWrapper extends ModiscoASTNodeWrapper {

	public InterfaceDeclarationWrapper(InterfaceDeclaration interfaceDeclaration) {
        super(interfaceDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from InterfaceDeclaration not supported");
	}
	
}
