import org.eclipse.gmt.modisco.java.*;
import command.InjectionAction;
import command.impl.*;

public class MissingVariableInitializationUsingAValueAction implements InjectionAction {

  @Override
  public void doCommand(ASTNode node) {
    if (node instanceof VariableDeclarationFragment) {
      VariableDeclarationFragment varDecl = (VariableDeclarationFragment) node;
      int lastFragment = varDecl.getVariablesContainer().getFragments().size() - 1;
      ASTNode lit = varDecl.getVariablesContainer().getFragments().get(lastFragment).getInitializer();
      new DeleteNodeCommand().doCommand(lit);
    }
  }
}
