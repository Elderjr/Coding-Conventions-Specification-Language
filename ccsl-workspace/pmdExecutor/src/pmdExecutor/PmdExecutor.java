package pmdExecutor;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PmdExecutor {

	private static final String PMD_DIRECTORY = "D:\\static-analyzers\\pmd-bin-6.18.0\\bin\\pmd.bat";
	private static final String PMD_RESULT_FILE_DESTINATION = "";
	
	private static final List<PMDRule> PMD_RULES = new LinkedList<>(
			Arrays.asList(new PMDRule("errorProne.xml", "DoNotCallGarbageCollectionExplicitly")
	));

	private static String buildCommand(PMDRule rule) {
		String pmdCommand = "-f text -R category/" + rule.getCategory() + "/" + rule.getName();
		return "cmd /c start /wait cmd.exe /K \" ping localhost && exit \"";
	}

	private static void executePrompCommand(String command) {
		try {
			Process p = Runtime.getRuntime().exec(command);
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void executePmdRules(String projectName) {

	}

	public static void main(String[] args) {
		System.out.println("test");

	}
}
