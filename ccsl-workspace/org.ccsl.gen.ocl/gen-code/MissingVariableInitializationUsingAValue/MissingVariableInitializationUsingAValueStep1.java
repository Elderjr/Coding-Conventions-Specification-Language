import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.*;

public class MissingVariableInitializationUsingAValueStep1 implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    if (root instanceof VariableDeclarationFragment) {
      VariableDeclarationFragment varDecl = (VariableDeclarationFragment) root;
      int lastFragment = varDecl.getVariablesContainer().getFragments().size() - 1;
      if(lastFragment >= 0) {
        ASTNode initialValue = varDecl.getVariablesContainer().getFragments().get(lastFragment).getInitializer();
        return initialValue;
      }
    }
    return null;
  }

  @Override
  public boolean doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      return new DeleteNodeCommand().doAction(target);
    }
    return false;
  }
}
