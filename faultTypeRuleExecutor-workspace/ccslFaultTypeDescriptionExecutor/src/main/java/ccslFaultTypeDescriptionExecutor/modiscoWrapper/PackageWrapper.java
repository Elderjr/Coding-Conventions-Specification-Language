package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Package;

public class PackageWrapper extends ModiscoWrapper {

	public PackageWrapper(Package pack) {
        super(pack);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
