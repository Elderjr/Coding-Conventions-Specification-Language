
public class Test {

	public void foo() {
		int a = 5;
		int b = 2;
		boolean exp = a == 2 && a == 5;
		
		if(!(a == 7 && a == 8)) {
			
		}

		
		if(a == 5 && a == 2 && (a == 3 && a == 2)) {
			
		}
		
		
		
		//1
		if(((a == 8 && a == 9) || a == 8)) {
			
		}
		//1
		if(a == 8 || a == 9 && a == 8) {
			
		}
	}
}
