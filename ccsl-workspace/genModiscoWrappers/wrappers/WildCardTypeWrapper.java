package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.WildCardType;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class WildCardTypeWrapper extends ModiscoASTNodeWrapper {

	public WildCardTypeWrapper(WildCardType wildCardType) {
        super(wildCardType);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from WildCardType not supported");
	}
	
}
