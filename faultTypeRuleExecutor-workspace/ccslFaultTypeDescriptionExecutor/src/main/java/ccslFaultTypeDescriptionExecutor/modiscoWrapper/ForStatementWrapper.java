package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ForStatement;

public class ForStatementWrapper extends ModiscoWrapper {

	public ForStatementWrapper(ForStatement forStatement) {
        super(forStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
