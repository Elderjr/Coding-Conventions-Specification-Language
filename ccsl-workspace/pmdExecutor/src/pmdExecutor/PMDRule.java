package pmdExecutor;

public class PMDRule {

	private String category;
	private String name;
	
	public PMDRule(String category, String name) {
		this.category = category;
		this.name = name;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public String getName() {
		return this.name;
	}
}
