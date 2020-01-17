package sampleProject;

public class Sample {

	private int a;
	
	public void foo() {
		bar(5);
		for(int i = 0; i < 5; i++) {
			bar(a);
		}
	}
	
	public void bar(int z) {
		int w = 0;
		foo();
	}

}