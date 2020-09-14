package org.ccsl.checker.utils;

import java.io.File;
import java.util.Optional;

public class FileUtils {

	public static String getFileExtension(File f) {
		Optional<String> extension = Optional.<String>of(f.getName())
				.filter(s -> s.indexOf('.') != -1)
				.map(s -> s.substring(s.indexOf('.') + 1));
		if(extension.isPresent()) {
			return extension.get();
		}
		return null;
	}
	
	public static String getFileNameWithoutExtension(File f) {
		int extensionStartIndex = f.getName().lastIndexOf('.');
		if(extensionStartIndex != -1) {
			return f.getName().substring(0, extensionStartIndex);
		}
		return null;
	}
}
