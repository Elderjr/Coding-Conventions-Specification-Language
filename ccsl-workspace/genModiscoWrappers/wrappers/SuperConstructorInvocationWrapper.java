package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SuperConstructorInvocationWrapper extends ModiscoASTNodeWrapper {

	public SuperConstructorInvocationWrapper(SuperConstructorInvocation superConstructorInvocation) {
        super(superConstructorInvocation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SuperConstructorInvocation not supported");
	}
	
}
