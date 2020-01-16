package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AbstractMethodInvocationWrapper extends ModiscoASTNodeWrapper {

	public AbstractMethodInvocationWrapper(AbstractMethodInvocation abstractMethodInvocation) {
        super(abstractMethodInvocation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AbstractMethodInvocation not supported");
	}
	
}
