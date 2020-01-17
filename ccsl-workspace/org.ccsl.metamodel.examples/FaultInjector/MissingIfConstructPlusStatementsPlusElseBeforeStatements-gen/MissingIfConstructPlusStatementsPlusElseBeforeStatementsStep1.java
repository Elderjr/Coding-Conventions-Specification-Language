import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.*;

public class MissingIfConstructPlusStatementsPlusElseBeforeStatementsStep1 implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    if (root instanceof IfStatement) {
      IfStatement ifStmt = (IfStatement) root;
      return ifStmt.getElseStatement();
    }
    return null;
  }

  @Override
  public boolean doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      return new MoveScopeUpAction().doAction(target);
    }
    return false;
  }
}
