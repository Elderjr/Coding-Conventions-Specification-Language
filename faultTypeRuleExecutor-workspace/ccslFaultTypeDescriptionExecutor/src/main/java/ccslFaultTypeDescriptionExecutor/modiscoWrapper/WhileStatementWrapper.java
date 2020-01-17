package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.WhileStatement;

public class WhileStatementWrapper extends ModiscoWrapper {

	public WhileStatementWrapper(WhileStatement whileStatement) {
        super(whileStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
