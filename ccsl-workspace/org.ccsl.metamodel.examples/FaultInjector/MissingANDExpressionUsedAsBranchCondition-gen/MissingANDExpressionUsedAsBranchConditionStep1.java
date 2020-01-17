import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.*;

public class MissingANDExpressionUsedAsBranchConditionStep1 implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    if (root instanceof PrefixExpression) {
      PrefixExpression prefixExpression = (PrefixExpression) root;
      return prefixExpression.getOperand();
    } else if (root instanceof InfixExpression) {
      InfixExpression infixExpression = (InfixExpression) root;
      int extendedOperandsSize = infixExpression.getExtendedOperands().size();
      if(extendedOperandsSize > 0) {
        return infixExpression.getExtendedOperands().get(extendedOperandsSize - 1);
      } else {
        return infixExpression.getRightOperand();
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
