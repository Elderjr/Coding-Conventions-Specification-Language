package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.CompilationUnit;

public class CompilationUnitWrapper extends ModiscoWrapper {

	public CompilationUnitWrapper(CompilationUnit compilationUnit) {
        super(compilationUnit);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
