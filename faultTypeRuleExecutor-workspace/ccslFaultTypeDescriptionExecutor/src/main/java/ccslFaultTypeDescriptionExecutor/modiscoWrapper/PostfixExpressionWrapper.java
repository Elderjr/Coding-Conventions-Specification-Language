package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PostfixExpression;

public class PostfixExpressionWrapper extends ModiscoWrapper {

	public PostfixExpressionWrapper(PostfixExpression postfixExpression) {
        super(postfixExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
