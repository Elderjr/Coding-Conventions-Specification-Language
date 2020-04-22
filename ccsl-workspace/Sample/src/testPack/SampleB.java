package testPack;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

public class SampleB extends SampleA{
	
	private final Integer x;
	
	public SampleB() {
		x = null;
		k();
		SampleB b = new SampleB();
		b.k();
		foo();
	}
	
	public void k () {
		
	}
	
	public final void foo() {
		Random random = new Random();
		if (random.nextDouble() > 0.5) {
			String eastWest = " West ";
		}
		
	}
}