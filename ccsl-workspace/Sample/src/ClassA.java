import java.util.Collections;
import java.util.List;

public abstract class ClassA {

	public static int a;
	
	public <T> List<T> test() {
		List<Integer> a = this.<Integer>test();
		return null;
	}
	public static void main(String... args) {
		
		Collections.<Integer>emptyList();
	
	}
}
