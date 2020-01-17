package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;

public class VariableDeclarationExpressionWrapper extends ModiscoWrapper {

	public VariableDeclarationExpressionWrapper(VariableDeclarationExpression variableDeclarationExpression) {
        super(variableDeclarationExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
