package compiler;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import command.InjectionAction;

public class JavaSourceFromString {

	private static String readCode(String sourcePath) throws FileNotFoundException {
		InputStream stream = new FileInputStream(sourcePath);
		String separator = System.getProperty("line.separator");
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		return reader.lines().collect(Collectors.joining(separator));
	}

	private static Path saveSource(String className, String code) throws IOException {
		String tmpProperty = System.getProperty("java.io.tmpdir");
		Path sourcePath = Paths.get(tmpProperty, className + ".java");
		Files.write(sourcePath, code.getBytes("UTF-8"));
		return sourcePath;
	}

	private static Path compileSource(String className, Path javaFile) {
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		compiler.run(null, null, null, javaFile.toFile().getAbsolutePath());
		return javaFile.getParent().resolve(className + ".class");
	}

	private static Object runClass(String className, Path javaClass)
			throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		URL classUrl = javaClass.getParent().toFile().toURI().toURL();
		URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { classUrl });
		Class<?> clazz = Class.forName(className, true, classLoader);
		return clazz.getDeclaredConstructor().newInstance();
	}

	public static Object compileClass(String className, String sourcePath) throws Exception {
		System.out.println(sourcePath);
		String code = readCode(sourcePath);
		Path javaFile = saveSource(className, code);
		Path classFile = compileSource(className, javaFile);
		return runClass(className, classFile);
	}

}
