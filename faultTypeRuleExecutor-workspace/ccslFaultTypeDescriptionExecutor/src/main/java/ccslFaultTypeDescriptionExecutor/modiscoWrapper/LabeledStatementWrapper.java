package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.LabeledStatement;

public class LabeledStatementWrapper extends ModiscoWrapper {

	public LabeledStatementWrapper(LabeledStatement labeledStatement) {
        super(labeledStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
