package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.NamespaceAccess;

public class NamespaceAccessWrapper extends ModiscoWrapper {

	public NamespaceAccessWrapper(NamespaceAccess namespaceAccess) {
        super(namespaceAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
