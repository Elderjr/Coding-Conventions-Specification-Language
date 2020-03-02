package ccslSpecification;

import java.util.List;

public class CCSLReport {

	private String project;
	private int totalViolations;
	private int totalViolationsWithLine;
	private List<String> violations;
	private long oclQueryTime;
	private long gettingLinesTime;

	public CCSLReport(String project, List<String> violations, int totalViolations, int totalViolationsWithLine,
			long oclQueryTime, long gettingLinesTime) {
		this.project = project;
		this.violations = violations;
		this.totalViolations = totalViolations;
		this.totalViolationsWithLine = totalViolationsWithLine;
		this.oclQueryTime = oclQueryTime;
		this.gettingLinesTime = gettingLinesTime;
	}

	public String getProject() {
		return project;
	}

	public int getTotalViolations() {
		return totalViolations;
	}

	public int getTotalViolationsWithLine() {
		return totalViolationsWithLine;
	}

	public List<String> getViolations() {
		return violations;
	}

	public long getOclQueryTime() {
		return oclQueryTime;
	}

	public long getGettingLinesTime() {
		return gettingLinesTime;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Project: ").append(project).append('\n');
		strBuilder.append("Total Violations: ").append(totalViolations).append('\n');
		strBuilder.append("Violations with lines: ").append(totalViolationsWithLine).append('\n');
		strBuilder.append("Ocl query time: ").append(oclQueryTime).append('\n');
		strBuilder.append("Getting violations lines time: ").append(gettingLinesTime).append('\n');
		return strBuilder.toString();
	}
	

}
