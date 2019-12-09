package sampleProject;

import java.io.BufferedReader;
import java.io.IOException;

public class Sample {
	public void foo() throws IOException {
		int a = 5;
		if (a == 5) {
			System.out.println("error");
		}

		System.out.println("a <> 6");
		{
			System.out.println("a == 8");
		}
	}

}
