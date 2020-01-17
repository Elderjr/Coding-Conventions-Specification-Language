package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;

public class AbstractVariablesContainerWrapper extends ModiscoWrapper {

	public AbstractVariablesContainerWrapper(AbstractVariablesContainer abstractVariablesContainer) {
        super(abstractVariablesContainer);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
