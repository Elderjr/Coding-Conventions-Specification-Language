package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ReturnStatement;

public class ReturnStatementWrapper extends ModiscoWrapper {

	public ReturnStatementWrapper(ReturnStatement returnStatement) {
        super(returnStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
