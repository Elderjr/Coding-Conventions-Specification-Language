package faultType;

import command.InjectionCommand;
import faultInjectorStrategy.FaultInjectorStrategy;

public class FaultTypeDescription {

	private String ocl;
	private InjectionCommand action;
	private FaultInjectorStrategy strategy;

	public FaultTypeDescription(String ocl, InjectionCommand action, FaultInjectorStrategy strategy) {
		this.ocl = ocl;
		this.action = action;
		this.strategy = strategy;
	}

	public String getOcl() {
		return this.ocl;
	}

	public InjectionCommand getAction() {
		return this.action;
	}

	public FaultInjectorStrategy getStrategy() {
		return this.strategy;
	}

}
