package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeLong;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeLongWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeLongWrapper(PrimitiveTypeLong primitiveTypeLong) {
        super(primitiveTypeLong);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeLong not supported");
	}
	
}
