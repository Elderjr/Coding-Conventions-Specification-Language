package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ManifestAttribute;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ManifestAttributeWrapper extends ModiscoASTNodeWrapper {

	public ManifestAttributeWrapper(ManifestAttribute manifestAttribute) {
        super(manifestAttribute);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ManifestAttribute not supported");
	}
	
}
