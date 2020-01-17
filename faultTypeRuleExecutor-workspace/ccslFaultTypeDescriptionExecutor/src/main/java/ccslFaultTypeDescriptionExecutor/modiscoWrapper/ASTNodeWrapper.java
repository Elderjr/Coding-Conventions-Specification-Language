package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;

public class ASTNodeWrapper extends ModiscoWrapper {

	public ASTNodeWrapper(ASTNode aSTNode) {
        super(aSTNode);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
