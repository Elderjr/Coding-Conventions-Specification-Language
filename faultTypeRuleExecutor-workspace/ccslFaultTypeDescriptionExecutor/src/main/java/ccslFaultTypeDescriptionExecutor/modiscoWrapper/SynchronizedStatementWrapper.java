package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SynchronizedStatement;

public class SynchronizedStatementWrapper extends ModiscoWrapper {

	public SynchronizedStatementWrapper(SynchronizedStatement synchronizedStatement) {
        super(synchronizedStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
