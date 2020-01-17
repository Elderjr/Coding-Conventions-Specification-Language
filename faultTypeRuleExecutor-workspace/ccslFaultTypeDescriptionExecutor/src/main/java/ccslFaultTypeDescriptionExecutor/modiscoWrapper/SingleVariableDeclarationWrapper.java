package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;

public class SingleVariableDeclarationWrapper extends ModiscoWrapper {

	public SingleVariableDeclarationWrapper(SingleVariableDeclaration singleVariableDeclaration) {
        super(singleVariableDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
