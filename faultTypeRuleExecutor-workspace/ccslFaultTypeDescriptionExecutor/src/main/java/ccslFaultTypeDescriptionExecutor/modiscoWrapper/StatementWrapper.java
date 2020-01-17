package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Statement;

public class StatementWrapper extends ModiscoWrapper {

	public StatementWrapper(Statement statement) {
        super(statement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
