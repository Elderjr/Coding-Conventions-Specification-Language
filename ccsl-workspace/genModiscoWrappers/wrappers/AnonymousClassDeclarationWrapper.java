package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AnonymousClassDeclarationWrapper extends ModiscoASTNodeWrapper {

	public AnonymousClassDeclarationWrapper(AnonymousClassDeclaration anonymousClassDeclaration) {
        super(anonymousClassDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AnonymousClassDeclaration not supported");
	}
	
}
