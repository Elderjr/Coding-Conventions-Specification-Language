package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeDouble;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeDoubleWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeDoubleWrapper(PrimitiveTypeDouble primitiveTypeDouble) {
        super(primitiveTypeDouble);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeDouble not supported");
	}
	
}
