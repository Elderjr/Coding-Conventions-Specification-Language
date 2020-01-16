package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.MethodRefParameter;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class MethodRefParameterWrapper extends ModiscoASTNodeWrapper {

	public MethodRefParameterWrapper(MethodRefParameter methodRefParameter) {
        super(methodRefParameter);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from MethodRefParameter not supported");
	}
	
}
