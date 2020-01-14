import org.eclipse.gmt.modisco.java.*;
import faultTypeRuleExecutor.command.InjectionAction;
import faultTypeRuleExecutor.command.impl.*;

public class MissingVariableInitializationUsingAValueAction implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    if (root instanceof VariableDeclarationFragment) {
      VariableDeclarationFragment varDecl = (VariableDeclarationFragment) root;
      int lastFragment = varDecl.getVariablesContainer().getFragments().size() - 1;
      ASTNode initialValue = varDecl.getVariablesContainer().getFragments().get(lastFragment).getInitializer();
      return initialValue;
    }
    return null;
  }

  @Override
  public void doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      new DeleteNodeCommand().doAction(target);
    }
  }
}
