package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.NumberLiteral;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class NumberLiteralWrapper extends ModiscoASTNodeWrapper {

	public NumberLiteralWrapper(NumberLiteral numberLiteral) {
        super(numberLiteral);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from NumberLiteral not supported");
	}
	
}
