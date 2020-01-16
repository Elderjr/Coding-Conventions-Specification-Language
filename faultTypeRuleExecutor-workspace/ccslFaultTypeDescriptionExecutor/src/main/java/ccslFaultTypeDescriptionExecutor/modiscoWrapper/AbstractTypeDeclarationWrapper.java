package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AbstractTypeDeclarationWrapper extends ModiscoASTNodeWrapper {

	public AbstractTypeDeclarationWrapper(AbstractTypeDeclaration abstractTypeDeclaration) {
        super(abstractTypeDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AbstractTypeDeclaration not supported");
	}
	
}
