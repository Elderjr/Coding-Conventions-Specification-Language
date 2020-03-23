import javax.management.RuntimeErrorException;

public class Hello {

	public static void main(String a) {
		
		if(true) {
			a = a + "b";
		}
		
		a = "b" + a;
	}
	
	protected void redirect(String target) {
		
	}

}
