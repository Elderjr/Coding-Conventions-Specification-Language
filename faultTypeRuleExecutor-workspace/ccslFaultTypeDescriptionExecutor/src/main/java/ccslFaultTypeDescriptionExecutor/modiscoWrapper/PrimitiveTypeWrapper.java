package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveType;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeWrapper(PrimitiveType primitiveType) {
        super(primitiveType);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveType not supported");
	}
	
}
