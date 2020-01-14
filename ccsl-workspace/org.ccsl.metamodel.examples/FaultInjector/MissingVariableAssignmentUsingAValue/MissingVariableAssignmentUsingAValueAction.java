import org.eclipse.gmt.modisco.java.*;
import faultTypeRuleExecutor.command.InjectionAction;
import faultTypeRuleExecutor.command.impl.*;

public class MissingVariableAssignmentUsingAValueAction implements InjectionAction {

  @Override
  public void doAction(ASTNode node) {
    if (node instanceof Assignment) {
      Assignment assignment = (Assignment) node;
      new DeleteNodeCommand().doAction(assignment);
    }
  }
}
