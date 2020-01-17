package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.MethodDeclaration;

public class MethodDeclarationWrapper extends ModiscoWrapper {

	public MethodDeclarationWrapper(MethodDeclaration methodDeclaration) {
        super(methodDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
