package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AnnotationMemberValuePairWrapper extends ModiscoASTNodeWrapper {

	public AnnotationMemberValuePairWrapper(AnnotationMemberValuePair annotationMemberValuePair) {
        super(annotationMemberValuePair);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AnnotationMemberValuePair not supported");
	}
	
}
