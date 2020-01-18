package ccslFaultTypeDescriptionExecutor;

import org.eclipse.gmt.modisco.java.Model;

public class FaultTypeDescriptionRunMetrics {

	private long queryTime;
	private long injectionTime;
	private long regenerateProjectTime;
	private int totalElementsSelectedByQuery;
	private int totalElementsModified;
	
	public FaultTypeDescriptionRunMetrics() {
		
	}

	public long getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(long queryTime) {
		// System.out.println("#Notification query time: " + queryTime);
		this.queryTime = queryTime;
	}

	public long getInjectionTime() {
		return injectionTime;
	}

	public void setInjectionTime(long injectionTime) {
		// System.out.println("#Notification injection time: " + injectionTime);
		this.injectionTime = injectionTime;
	}

	public long getRegenerateProjectTime() {
		return regenerateProjectTime;
	}

	public void setRegenerateProjectTime(long regenerateProjectTime) {
		// System.out.println("#Notification regeneration project time: " + regenerateProjectTime);
		this.regenerateProjectTime = regenerateProjectTime;
	}

	public int getTotalElementsSelectedByQuery() {
		return totalElementsSelectedByQuery;
	}

	public void setTotalElementsSelectedByQuery(int totalElementsSelectedByQuery) {
		// System.out.println("#Notification total elements selected by query: " + totalElementsSelectedByQuery);
		this.totalElementsSelectedByQuery = totalElementsSelectedByQuery;
	}

	public int getTotalElementsModified() {
		return totalElementsModified;
	}

	public void setTotalElementsModified(int totalElementsModified) {
		// System.out.println("#Notification total elements modified: " + totalElementsModified);
		this.totalElementsModified = totalElementsModified;
	}

}
