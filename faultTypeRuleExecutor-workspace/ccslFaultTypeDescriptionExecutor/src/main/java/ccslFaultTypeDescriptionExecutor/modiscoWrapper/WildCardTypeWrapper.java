package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.WildCardType;

public class WildCardTypeWrapper extends ModiscoWrapper {

	public WildCardTypeWrapper(WildCardType wildCardType) {
        super(wildCardType);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
