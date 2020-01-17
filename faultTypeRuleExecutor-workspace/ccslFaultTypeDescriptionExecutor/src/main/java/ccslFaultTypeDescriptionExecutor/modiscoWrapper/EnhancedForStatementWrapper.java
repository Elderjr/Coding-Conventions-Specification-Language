package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;

public class EnhancedForStatementWrapper extends ModiscoWrapper {

	public EnhancedForStatementWrapper(EnhancedForStatement enhancedForStatement) {
        super(enhancedForStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
