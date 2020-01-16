package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ParameterizedType;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ParameterizedTypeWrapper extends ModiscoASTNodeWrapper {

	public ParameterizedTypeWrapper(ParameterizedType parameterizedType) {
        super(parameterizedType);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ParameterizedType not supported");
	}
	
}
