package faultTypeRuleExecutor.command.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

import faultTypeRuleExecutor.command.InjectionAction;

public class ActionPipe {

	private List<InjectionAction> pipe;

	public ActionPipe() {
		this.pipe = new LinkedList<>();
	}

	public void addAction(InjectionAction action) {
		this.pipe.add(action);
	}

	public void doActions(ASTNode node) {
		for (InjectionAction action : pipe) {
			action.doAction(node);
		}
	}
}
