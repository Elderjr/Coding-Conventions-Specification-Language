package ccslFaultTypeDescriptionExecutor.javaCompiler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class JavaCompilerFromString {

	private static String readCode(String sourcePath) throws StringToJavaCompilationException {
		String separator = System.getProperty("line.separator");
		String code;
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourcePath)))) {
			code = reader.lines().collect(Collectors.joining(separator));
		} catch (IOException ex) {
			throw new StringToJavaCompilationException(ex);
		}
		return code;
	}

	private static Path saveSource(String className, String code) throws StringToJavaCompilationException {
		Path sourcePath;
		try {
			String tmpProperty = System.getProperty("java.io.tmpdir");
			sourcePath = Paths.get(tmpProperty, className + ".java");
			Files.write(sourcePath, code.getBytes("UTF-8"));
		} catch (IOException ex) {
			throw new StringToJavaCompilationException(ex);
		}
		return sourcePath;
	}

	private static Path compileSource(String className, Path javaFile) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null, javaFile.toFile().getAbsolutePath());
		return javaFile.getParent().resolve(className + ".class");
	}

	private static Object runClass(String className, Path javaClass) throws StringToJavaCompilationException {
		Object instance;
		try {
			URL classUrl = javaClass.getParent().toFile().toURI().toURL();
			URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { classUrl });
			Class<?> clazz = Class.forName(className, true, classLoader);
			instance = clazz.getDeclaredConstructor().newInstance();
		} catch (Exception ex) {
			throw new StringToJavaCompilationException(ex);
		}
		return instance;
	}

	public static Object getNewInstanceClassFromFile(String className, String sourcePath) throws StringToJavaCompilationException {
		String code = readCode(sourcePath);
		Path javaFile = saveSource(className, code);
		Path classFile = compileSource(className, javaFile);
		return runClass(className, classFile);
	}

}