package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ExpressionStatement;

public class ExpressionStatementWrapper extends ModiscoWrapper {

	public ExpressionStatementWrapper(ExpressionStatement expressionStatement) {
        super(expressionStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
