package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SwitchStatement;

public class SwitchStatementWrapper extends ModiscoWrapper {

	public SwitchStatementWrapper(SwitchStatement switchStatement) {
        super(switchStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
