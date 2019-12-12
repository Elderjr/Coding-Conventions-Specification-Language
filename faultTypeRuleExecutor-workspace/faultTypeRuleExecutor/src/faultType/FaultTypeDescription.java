package faultType;

import java.util.List;

import command.InjectionAction;
import command.impl.ActionPipe;
import faultInjectorStrategy.FaultInjectorStrategy;

public class FaultTypeDescription {

	private String ocl;
	private ActionPipe pipe;
	private FaultInjectorStrategy strategy;

	public FaultTypeDescription(String ocl, ActionPipe pipe, FaultInjectorStrategy strategy) {
		this.ocl = ocl;
		this.pipe = pipe;
		this.strategy = strategy;
	}

	public String getOcl() {
		return this.ocl;
	}

	public ActionPipe getActionPipe() {
		return this.pipe;
	}

	public FaultInjectorStrategy getStrategy() {
		return this.strategy;
	}

}
