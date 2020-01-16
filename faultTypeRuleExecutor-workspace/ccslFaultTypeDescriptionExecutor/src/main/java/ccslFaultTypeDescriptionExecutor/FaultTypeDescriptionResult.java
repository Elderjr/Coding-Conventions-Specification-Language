package ccslFaultTypeDescriptionExecutor;

import org.eclipse.gmt.modisco.java.Model;

public class FaultTypeDescriptionResult {

	private long performance;
	private int totalElementsSelectedByQuery;
	private int totalElementsSelectedByStrategy;
	private int totalElementsModified;
	private Model modifiedModiscoModel;
	
	FaultTypeDescriptionResult(long performance, int totalElementsSelectedByQuery, int totalElementsSelectedByStrategy, int totalElementsModified, Model modifiedModiscoModel) {
		this.performance = performance;
		this.totalElementsSelectedByQuery = totalElementsSelectedByQuery;
		this.totalElementsSelectedByStrategy = totalElementsSelectedByStrategy;
		this.totalElementsModified = totalElementsModified;
		this.modifiedModiscoModel = modifiedModiscoModel;
	}

	public long getPerformance() {
		return this.performance;
	}
	
	public int getTotalElementsSelectedByQuery() {
		return this.totalElementsSelectedByQuery;
	}
	
	public int getTotalElementsSelectedByStrategy() {
		return this.totalElementsSelectedByStrategy;
	}
	
	public int getTotalElementsModified() {
		return this.totalElementsModified;
	}
	
	public Model getModifiedModiscoModel() {
		return this.modifiedModiscoModel;
	}
}
