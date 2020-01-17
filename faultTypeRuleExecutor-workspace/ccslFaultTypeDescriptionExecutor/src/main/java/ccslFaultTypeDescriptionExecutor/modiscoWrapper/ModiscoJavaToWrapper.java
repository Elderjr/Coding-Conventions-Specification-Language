package ccslFaultTypeDescriptionExecutor.modiscoWrapper;



import org.eclipse.gmt.modisco.java.ASTNode;

public class ModiscoJavaToWrapper {

	
	public static ModiscoWrapper modiscoJavaToWrapper(ASTNode node) {
		ModiscoWrapper wrapper = null;
		try {
			String simpleName = node.getClass().getSimpleName().replace("Impl", "") + "Wrapper"; 
			String className = "ccslFaultTypeDescriptionExecutor.modiscoWrapper." + simpleName;
			Class c = Class.forName(className);
			wrapper = (ModiscoWrapper) c.getDeclaredConstructor(node.getClass().getInterfaces()[0]).newInstance(node);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wrapper;
	}
}
