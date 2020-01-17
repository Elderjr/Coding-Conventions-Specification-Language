package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ThrowStatement;

public class ThrowStatementWrapper extends ModiscoWrapper {

	public ThrowStatementWrapper(ThrowStatement throwStatement) {
        super(throwStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
