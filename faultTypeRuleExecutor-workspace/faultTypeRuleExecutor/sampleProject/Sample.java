package sampleProject;

import java.io.IOException;

public class Sample {
	public void qux(int a) {
	}

	public void foo() throws IOException {
		{
			System.out.println("Bloco false");
		}
		qux(5 + 3 + 2 + 7);
	}

}
