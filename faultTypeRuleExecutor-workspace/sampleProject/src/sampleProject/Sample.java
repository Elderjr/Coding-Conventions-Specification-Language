package sampleProject;


import java.io.IOException;

public class Sample {

	public void qux(int a) {
		
	}
	public void foo() throws IOException {
		int a = 5;
		if(true) {
			System.out.println("Bloco true");
		} else {
			System.out.println("Bloco false");
		}
		
		if(true)
			System.out.println("Bloco True");
		else
			System.out.println("Bloco False");
		qux(5 + 3 + 2 + 7);
	}

}