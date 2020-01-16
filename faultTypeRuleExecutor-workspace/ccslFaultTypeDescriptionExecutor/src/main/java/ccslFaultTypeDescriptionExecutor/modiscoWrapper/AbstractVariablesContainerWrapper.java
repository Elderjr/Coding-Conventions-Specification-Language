package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AbstractVariablesContainerWrapper extends ModiscoASTNodeWrapper {

	public AbstractVariablesContainerWrapper(AbstractVariablesContainer abstractVariablesContainer) {
        super(abstractVariablesContainer);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AbstractVariablesContainer not supported");
	}
	
}
