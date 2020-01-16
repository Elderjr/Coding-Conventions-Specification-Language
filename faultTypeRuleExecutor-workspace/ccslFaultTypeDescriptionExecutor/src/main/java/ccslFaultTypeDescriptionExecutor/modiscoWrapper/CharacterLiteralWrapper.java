package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.CharacterLiteral;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class CharacterLiteralWrapper extends ModiscoASTNodeWrapper {

	public CharacterLiteralWrapper(CharacterLiteral characterLiteral) {
        super(characterLiteral);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from CharacterLiteral not supported");
	}
	
}
