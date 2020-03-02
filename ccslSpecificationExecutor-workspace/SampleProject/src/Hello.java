import javax.management.RuntimeErrorException;

public class Hello {

	public static void main(String[] args) {
		int k = new Integer(1);
		for(int i = 0; i < 5; i++) {
			int j = new Integer(1);
			throw new RuntimeErrorException(null);
		}
	}
}
