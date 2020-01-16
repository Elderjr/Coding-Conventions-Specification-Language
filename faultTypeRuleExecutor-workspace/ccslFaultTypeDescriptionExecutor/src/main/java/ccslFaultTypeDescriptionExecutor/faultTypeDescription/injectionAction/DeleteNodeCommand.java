package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoJavaToWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;

public class DeleteNodeCommand implements InjectionAction {

  @Override
  public boolean doAction(ASTNode node){
	RecursiveTreeResult r = ActionUtils.getASTNodeContainerSkippingParentheses(node);
	ModiscoASTNodeWrapper container = ModiscoJavaToWrapper.modiscoJavaToWrapper(r.getLastNode());
	ASTNode field = r.getPreviousNode();
    return container.deleteField(field, node);
  }
}
