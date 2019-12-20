package faultTypeRuleExecutor.faultType;

public class FaultTypeDescriptionParserException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public FaultTypeDescriptionParserException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
