package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AnnotationTypeDeclarationWrapper extends ModiscoASTNodeWrapper {

	public AnnotationTypeDeclarationWrapper(AnnotationTypeDeclaration annotationTypeDeclaration) {
        super(annotationTypeDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AnnotationTypeDeclaration not supported");
	}
	
}
