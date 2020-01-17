package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PackageAccess;

public class PackageAccessWrapper extends ModiscoWrapper {

	public PackageAccessWrapper(PackageAccess packageAccess) {
        super(packageAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
