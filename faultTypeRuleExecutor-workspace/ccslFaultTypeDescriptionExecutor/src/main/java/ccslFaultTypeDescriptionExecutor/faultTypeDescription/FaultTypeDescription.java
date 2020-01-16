package ccslFaultTypeDescriptionExecutor.faultTypeDescription;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionPipe;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionStrategy.InjectionStrategy;

public class FaultTypeDescription {

	private String ocl;
	private ActionPipe pipe;
	private InjectionStrategy strategy;

	public FaultTypeDescription(String ocl, ActionPipe pipe, InjectionStrategy strategy) {
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

	public InjectionStrategy getStrategy() {
		return this.strategy;
	}

}
