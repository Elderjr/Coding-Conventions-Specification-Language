package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class CompilationUnitWrapper extends ModiscoASTNodeWrapper {

	public CompilationUnitWrapper(CompilationUnit compilationUnit) {
        super(compilationUnit);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from CompilationUnit not supported");
	}
	
}
