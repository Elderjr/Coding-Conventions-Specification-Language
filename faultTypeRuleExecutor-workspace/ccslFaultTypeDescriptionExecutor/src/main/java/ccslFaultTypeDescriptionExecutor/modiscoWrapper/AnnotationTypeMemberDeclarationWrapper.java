package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AnnotationTypeMemberDeclarationWrapper extends ModiscoASTNodeWrapper {

	public AnnotationTypeMemberDeclarationWrapper(AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration) {
        super(annotationTypeMemberDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AnnotationTypeMemberDeclaration not supported");
	}
	
}
