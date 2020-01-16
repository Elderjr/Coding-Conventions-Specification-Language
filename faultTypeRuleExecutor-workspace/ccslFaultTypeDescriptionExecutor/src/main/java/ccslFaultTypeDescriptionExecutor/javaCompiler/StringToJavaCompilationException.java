package ccslFaultTypeDescriptionExecutor.javaCompiler;

public class StringToJavaCompilationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Exception exceptionHandling;
	
	public StringToJavaCompilationException(Exception exceptionHandling) {
		this.exceptionHandling = exceptionHandling;
	}
	
	public Exception getExceptionHandling() {
		return this.exceptionHandling;
	}
}
