package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeBoolean;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeBooleanWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeBooleanWrapper(PrimitiveTypeBoolean primitiveTypeBoolean) {
        super(primitiveTypeBoolean);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeBoolean not supported");
	}
	
}
