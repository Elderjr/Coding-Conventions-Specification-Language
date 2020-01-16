package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedAnnotationDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedAnnotationDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedAnnotationDeclarationWrapper(UnresolvedAnnotationDeclaration unresolvedAnnotationDeclaration) {
        super(unresolvedAnnotationDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedAnnotationDeclaration not supported");
	}
	
}
