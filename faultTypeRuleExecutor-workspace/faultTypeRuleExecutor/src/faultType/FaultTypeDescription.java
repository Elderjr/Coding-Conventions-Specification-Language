package faultType;

import java.util.List;

import command.InjectionAction;
import faultInjectorStrategy.FaultInjectorStrategy;

public class FaultTypeDescription {

	private String ocl;
	private List<InjectionAction> actions;
	private FaultInjectorStrategy strategy;

	public FaultTypeDescription(String ocl, List<InjectionAction> action, FaultInjectorStrategy strategy) {
		this.ocl = ocl;
		this.actions = action;
		this.strategy = strategy;
	}

	public String getOcl() {
		return this.ocl;
	}

	public List<InjectionAction> getActions() {
		return this.actions;
	}

	public FaultInjectorStrategy getStrategy() {
		return this.strategy;
	}

}
