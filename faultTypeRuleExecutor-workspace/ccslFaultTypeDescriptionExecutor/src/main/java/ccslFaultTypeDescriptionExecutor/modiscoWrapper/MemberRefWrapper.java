package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.MemberRef;

public class MemberRefWrapper extends ModiscoWrapper {

	public MemberRefWrapper(MemberRef memberRef) {
        super(memberRef);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
