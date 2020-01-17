package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.EmptyStatement;

public class EmptyStatementWrapper extends ModiscoWrapper {

	public EmptyStatementWrapper(EmptyStatement emptyStatement) {
        super(emptyStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
