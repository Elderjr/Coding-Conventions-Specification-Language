package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Archive;

public class ArchiveWrapper extends ModiscoWrapper {

	public ArchiveWrapper(Archive archive) {
        super(archive);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
