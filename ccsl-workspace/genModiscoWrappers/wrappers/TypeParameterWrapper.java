package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.TypeParameter;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class TypeParameterWrapper extends ModiscoASTNodeWrapper {

	public TypeParameterWrapper(TypeParameter typeParameter) {
        super(typeParameter);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from TypeParameter not supported");
	}
	
}
