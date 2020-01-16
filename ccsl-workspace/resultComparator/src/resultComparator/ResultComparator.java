package resultComparator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ResultComparator {

	private static List<String> getViolations(String fileName, String regex) throws IOException {
		List<String> violations = new LinkedList<>();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = null;
		File f = new File(fileName);
		try (FileReader fr = new FileReader(f); BufferedReader buffer = new BufferedReader(fr)) {
			while (buffer.ready()) {
				matcher = pattern.matcher(buffer.readLine());
				if (matcher.find()) {
					violations.add(matcher.group(0));
				}
			}
		}
		return violations;
	}
	
	private static List<String> getCCSLViolations(String ccslResultFile) throws IOException {
		List<String> ccslViolations = new LinkedList<>();
		for(String str : getViolations(ccslResultFile, "D:(.)*\\.java")) {
			ccslViolations.add(str.replaceAll("\\\\\\\\", "\\\\"));
		}
		return ccslViolations;
	}

	private static List<String> getPMDViolations() throws IOException {
		return getViolations("pmd.txt", "D:(.)*\\.java");
	}
	
	
	private static List<String> getDiff(List<String> a, List<String> b) {
		List<String> diff = new LinkedList<>();
		for(String str : a) {
			if(diff.contains(str)) continue;
			long count;
			if(!b.contains(str)) {
				count = a.stream().filter(x -> x.equals(str)).count();
			} else {
				long countA = a.stream().filter(x -> x.equals(str)).count();
				long countB = b.stream().filter(x -> x.equals(str)).count();
				count = countA - countB;
			}
			for(int i = 0; i < count; i++) {
				diff.add(str);
			}
		}
		return diff;
	}

	public static void main(String[] args) throws IOException {
		List<String> pmdViolations = getCCSLViolations("pmd.txt");
		List<String> ccslViolations = getCCSLViolations("ccsl.txt");
		System.out.println("#PMD Violations: " + pmdViolations.size());
		System.out.println("#PMD Files: " + pmdViolations.stream().collect(Collectors.toSet()).size());
		System.out.println("#CCSL Violations: " + ccslViolations.size());
		System.out.println("#CCSL Files: " + ccslViolations.stream().collect(Collectors.toSet()).size());
		System.out.println("=======================");
		List<String> notInPMD = getDiff(ccslViolations, pmdViolations);
		System.out.println("CCSL results that are not in PMD:");
		notInPMD.stream().forEach(s -> System.out.println(s));
		System.out.println(notInPMD.size());
		System.out.println("=======================");
		List<String> notInCCSL = getDiff(pmdViolations, ccslViolations);
		System.out.println("PMD results that are not in CCSL:");
		notInCCSL.stream().forEach(s -> System.out.println(s));
		System.out.println(notInCCSL.size());
	}
}
