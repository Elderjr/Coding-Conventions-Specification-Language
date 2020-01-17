package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.CatchClause;

public class CatchClauseWrapper extends ModiscoWrapper {

	public CatchClauseWrapper(CatchClause catchClause) {
        super(catchClause);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
