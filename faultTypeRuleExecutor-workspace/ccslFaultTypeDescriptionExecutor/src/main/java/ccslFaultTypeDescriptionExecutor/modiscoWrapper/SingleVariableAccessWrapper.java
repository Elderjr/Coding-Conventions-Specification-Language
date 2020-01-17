package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;

public class SingleVariableAccessWrapper extends ModiscoWrapper {

	public SingleVariableAccessWrapper(SingleVariableAccess singleVariableAccess) {
        super(singleVariableAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
