package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TryStatement;

public class TryStatementWrapper extends ModiscoWrapper {

	public TryStatementWrapper(TryStatement tryStatement) {
        super(tryStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
