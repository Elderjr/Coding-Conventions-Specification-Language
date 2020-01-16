package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionStrategy;

public final class InjectionStrategyFactory {

	public static InjectionStrategy createsStrategy(String strategyName) {
		if (strategyName.equals("All")) {
			return new AllStrategy();
		}
		return null;
	}
}
