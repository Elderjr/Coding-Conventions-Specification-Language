package sample;

public class Sample {
	
	@Deprecated
	private int foo;
	
	public void foo(final int x) {
		@Deprecated
		final int foo = 3;
	}
	
	public static void qux() {
		@Deprecated
		int foo = 3;
	}
}




