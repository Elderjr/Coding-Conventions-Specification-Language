package fileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	
	public static String fileToString(String path) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		StringBuilder content = new StringBuilder("");
		while(br.ready()) {
			content.append(br.readLine()).append('\n');
		}
		return content.toString();
	}
}
