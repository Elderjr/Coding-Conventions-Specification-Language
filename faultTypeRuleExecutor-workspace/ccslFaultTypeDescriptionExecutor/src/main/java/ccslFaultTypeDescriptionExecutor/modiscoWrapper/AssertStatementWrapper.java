package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AssertStatement;

public class AssertStatementWrapper extends ModiscoWrapper {

	public AssertStatementWrapper(AssertStatement assertStatement) {
        super(assertStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
