package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ContinueStatement;

public class ContinueStatementWrapper extends ModiscoWrapper {

	public ContinueStatementWrapper(ContinueStatement continueStatement) {
        super(continueStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
