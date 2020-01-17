package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.DoStatement;

public class DoStatementWrapper extends ModiscoWrapper {

	public DoStatementWrapper(DoStatement doStatement) {
        super(doStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
