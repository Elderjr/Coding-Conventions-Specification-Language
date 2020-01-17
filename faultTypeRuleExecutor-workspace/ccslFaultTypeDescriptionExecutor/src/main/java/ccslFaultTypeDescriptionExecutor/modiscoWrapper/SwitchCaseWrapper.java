package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SwitchCase;

public class SwitchCaseWrapper extends ModiscoWrapper {

	public SwitchCaseWrapper(SwitchCase switchCase) {
        super(switchCase);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
