package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AbstractMethodDeclarationWrapper extends ModiscoASTNodeWrapper {

	public AbstractMethodDeclarationWrapper(AbstractMethodDeclaration abstractMethodDeclaration) {
        super(abstractMethodDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AbstractMethodDeclaration not supported");
	}
	
}
