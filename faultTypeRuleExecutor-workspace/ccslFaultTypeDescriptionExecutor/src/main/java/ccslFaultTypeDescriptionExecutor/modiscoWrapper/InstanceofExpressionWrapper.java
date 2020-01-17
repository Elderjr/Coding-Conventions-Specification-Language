package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.InstanceofExpression;

public class InstanceofExpressionWrapper extends ModiscoWrapper {

	public InstanceofExpressionWrapper(InstanceofExpression instanceofExpression) {
        super(instanceofExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
