package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Assignment;

public class AssignmentWrapper extends ModiscoWrapper {

	public AssignmentWrapper(Assignment assignment) {
        super(assignment);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
