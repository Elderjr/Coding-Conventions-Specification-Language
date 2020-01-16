package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class TypeDeclarationWrapper extends ModiscoASTNodeWrapper {

	public TypeDeclarationWrapper(TypeDeclaration typeDeclaration) {
        super(typeDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from TypeDeclaration not supported");
	}
	
}
