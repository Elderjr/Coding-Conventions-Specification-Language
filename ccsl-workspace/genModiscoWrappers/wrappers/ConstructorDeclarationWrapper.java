package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ConstructorDeclarationWrapper extends ModiscoASTNodeWrapper {

	public ConstructorDeclarationWrapper(ConstructorDeclaration constructorDeclaration) {
        super(constructorDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ConstructorDeclaration not supported");
	}
	
}
