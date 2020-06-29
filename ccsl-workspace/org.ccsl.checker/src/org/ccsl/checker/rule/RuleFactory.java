package org.ccsl.checker.rule;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.ccsl.checker.utils.FileUtils;


public class RuleFactory {

	
	public static Rule createRuleFromFile(File f) throws IOException {
		String extension = FileUtils.getFileExtension(f);
		String ruleName=  FileUtils.getFileNameWithoutExtension(f);
		if(extension.equalsIgnoreCase("ocl")) {
			return new Rule(ruleName, getOclFromOclFile(f));
		}
		return null;
	}
	
	private static String getOclFromOclFile(File oclFile) throws IOException {
		Path path = oclFile.toPath();
		try(Stream<String> fileStream = Files.lines(path)){
			return fileStream.collect(Collectors.joining("\n"));
		}
	}
}
