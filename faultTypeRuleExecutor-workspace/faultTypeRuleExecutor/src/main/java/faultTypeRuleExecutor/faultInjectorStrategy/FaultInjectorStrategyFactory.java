package faultTypeRuleExecutor.faultInjectorStrategy;

import faultTypeRuleExecutor.faultInjectorStrategyImpl.AllStrategy;

public final class FaultInjectorStrategyFactory {

	public static FaultInjectorStrategy createsStrategy(String strategyName) {
		if (strategyName.equals("All")) {
			return new AllStrategy();
		}
		return null;
	}
}
