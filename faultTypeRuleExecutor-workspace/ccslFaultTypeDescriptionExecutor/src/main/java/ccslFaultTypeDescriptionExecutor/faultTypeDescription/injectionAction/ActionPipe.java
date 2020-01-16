package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

public class ActionPipe {

	private List<InjectionAction> pipe;

	public ActionPipe() {
		this.pipe = new LinkedList<>();
	}

	public void addAction(InjectionAction action) {
		this.pipe.add(action);
	}

	public boolean doActions(ASTNode node) {
		boolean isActionWasPerfomed = false;
		for (InjectionAction action : pipe) {
			boolean isActionWasPerfomedTmp = action.doAction(node);
			if(isActionWasPerfomedTmp) {
				isActionWasPerfomed = true;
			}
		}
		return isActionWasPerfomed;
	}
}
