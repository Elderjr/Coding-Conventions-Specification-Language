package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedAnnotationTypeMemberDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedAnnotationTypeMemberDeclarationWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedAnnotationTypeMemberDeclarationWrapper(UnresolvedAnnotationTypeMemberDeclaration unresolvedAnnotationTypeMemberDeclaration) {
        super(unresolvedAnnotationTypeMemberDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedAnnotationTypeMemberDeclaration not supported");
	}
	
}
