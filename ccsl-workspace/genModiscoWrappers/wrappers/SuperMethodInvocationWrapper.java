package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SuperMethodInvocation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SuperMethodInvocationWrapper extends ModiscoASTNodeWrapper {

	public SuperMethodInvocationWrapper(SuperMethodInvocation superMethodInvocation) {
        super(superMethodInvocation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SuperMethodInvocation not supported");
	}
	
}
