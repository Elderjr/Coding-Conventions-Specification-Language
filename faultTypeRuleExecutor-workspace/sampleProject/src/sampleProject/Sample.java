package sampleProject;

import java.io.BufferedReader;
import java.io.IOException;

public class Sample {

	public void foo() throws IOException {
		int a = 5;
		if(a == 5) {
			
		}else if(a == 5) {
			System.out.println("error");
		}
		
		if(a == 6)
			System.out.println("a == 6");
		else
			System.out.println("a <> 6");
		
		if(a == 7) {
			System.out.println("a == 7");
		} else {
			System.out.println("a == 8");
		}
	}

}