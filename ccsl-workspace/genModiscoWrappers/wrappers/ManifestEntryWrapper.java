package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ManifestEntry;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ManifestEntryWrapper extends ModiscoASTNodeWrapper {

	public ManifestEntryWrapper(ManifestEntry manifestEntry) {
        super(manifestEntry);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ManifestEntry not supported");
	}
	
}
