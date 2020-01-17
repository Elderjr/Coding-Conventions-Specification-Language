package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Annotation;

public class AnnotationWrapper extends ModiscoWrapper {

	public AnnotationWrapper(Annotation annotation) {
        super(annotation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
