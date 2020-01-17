package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.VariableDeclaration;

public class VariableDeclarationWrapper extends ModiscoWrapper {

	public VariableDeclarationWrapper(VariableDeclaration variableDeclaration) {
        super(variableDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
