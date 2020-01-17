package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.IfStatement;

public class IfStatementWrapper extends ModiscoWrapper {

	public IfStatementWrapper(IfStatement ifStatement) {
        super(ifStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
