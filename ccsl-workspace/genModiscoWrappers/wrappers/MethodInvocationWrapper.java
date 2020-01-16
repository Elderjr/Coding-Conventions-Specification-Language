package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class MethodInvocationWrapper extends ModiscoASTNodeWrapper {

	public MethodInvocationWrapper(MethodInvocation methodInvocation) {
        super(methodInvocation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from MethodInvocation not supported");
	}
	
}
