package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ConstructorInvocationWrapper extends ModiscoASTNodeWrapper {

	public ConstructorInvocationWrapper(ConstructorInvocation constructorInvocation) {
        super(constructorInvocation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ConstructorInvocation not supported");
	}
	
}
