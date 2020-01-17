package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AnnotationMemberValuePair;

public class AnnotationMemberValuePairWrapper extends ModiscoWrapper {

	public AnnotationMemberValuePairWrapper(AnnotationMemberValuePair annotationMemberValuePair) {
        super(annotationMemberValuePair);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
