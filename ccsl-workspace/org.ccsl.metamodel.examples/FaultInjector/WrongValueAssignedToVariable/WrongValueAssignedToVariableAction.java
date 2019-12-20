import org.eclipse.gmt.modisco.java.*;
import faultTypeRuleExecutor.command.InjectionAction;
import faultTypeRuleExecutor.command.impl.*;

public class WrongValueAssignedToVariableAction implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    if (root instanceof Assignment) {
      Assignment assignment = (Assignment) root;
      return assignment.getRightHandSide();
    }
    return null;
  }

  @Override
  public void doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      new ChangeLiteralValue().doAction(target);
    }
  }
}
