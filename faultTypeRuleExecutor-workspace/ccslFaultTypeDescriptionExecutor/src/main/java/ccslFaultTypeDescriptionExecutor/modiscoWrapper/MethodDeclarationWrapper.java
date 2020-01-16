package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class MethodDeclarationWrapper extends ModiscoASTNodeWrapper {

	public MethodDeclarationWrapper(MethodDeclaration methodDeclaration) {
        super(methodDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from MethodDeclaration not supported");
	}
	
}
