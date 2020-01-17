package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedLabeledStatement;

public class UnresolvedLabeledStatementWrapper extends ModiscoWrapper {

	public UnresolvedLabeledStatementWrapper(UnresolvedLabeledStatement unresolvedLabeledStatement) {
        super(unresolvedLabeledStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
