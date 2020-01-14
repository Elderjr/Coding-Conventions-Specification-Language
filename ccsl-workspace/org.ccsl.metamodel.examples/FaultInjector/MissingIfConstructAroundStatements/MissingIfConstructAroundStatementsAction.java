import org.eclipse.gmt.modisco.java.*;
import faultTypeRuleExecutor.command.InjectionAction;
import faultTypeRuleExecutor.command.impl.*;

public class MissingIfConstructAroundStatementsAction implements InjectionAction {

  @Override
  public void doAction(ASTNode node) {
    if (node instanceof IfStatement) {
      IfStatement ifStmt = (IfStatement) node;
      new MoveScopeUp().doAction(ifStmt.getThenStatement());
    }
  }
}
