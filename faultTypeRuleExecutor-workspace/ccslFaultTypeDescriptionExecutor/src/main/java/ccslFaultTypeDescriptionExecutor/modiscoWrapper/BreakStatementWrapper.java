package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.BreakStatement;

public class BreakStatementWrapper extends ModiscoWrapper {

	public BreakStatementWrapper(BreakStatement breakStatement) {
        super(breakStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
