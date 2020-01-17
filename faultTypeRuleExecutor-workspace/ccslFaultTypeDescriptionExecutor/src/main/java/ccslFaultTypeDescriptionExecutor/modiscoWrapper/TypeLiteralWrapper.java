package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TypeLiteral;

public class TypeLiteralWrapper extends ModiscoWrapper {

	public TypeLiteralWrapper(TypeLiteral typeLiteral) {
        super(typeLiteral);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
