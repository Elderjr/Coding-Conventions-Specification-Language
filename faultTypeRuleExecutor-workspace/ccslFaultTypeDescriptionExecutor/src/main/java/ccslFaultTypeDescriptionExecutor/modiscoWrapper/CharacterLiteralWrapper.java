package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.CharacterLiteral;

public class CharacterLiteralWrapper extends ModiscoWrapper {

	public CharacterLiteralWrapper(CharacterLiteral characterLiteral) {
        super(characterLiteral);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
