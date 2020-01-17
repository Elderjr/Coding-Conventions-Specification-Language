package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;

public class VariableDeclarationStatementWrapper extends ModiscoWrapper {

	public VariableDeclarationStatementWrapper(VariableDeclarationStatement variableDeclarationStatement) {
        super(variableDeclarationStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
