package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ThisExpression;

public class ThisExpressionWrapper extends ModiscoWrapper {

	public ThisExpressionWrapper(ThisExpression thisExpression) {
        super(thisExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
