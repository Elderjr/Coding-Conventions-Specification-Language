package command.impl;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ClassUtils {

	private static List<Field> getAllClassFieldsRec(List<Field> fields, Class<?> type) {
		fields.addAll(Arrays.asList(type.getDeclaredFields()));
		if (type.getSuperclass() != null) {
			getAllClassFieldsRec(fields, type.getSuperclass());
		}
		return fields;
	}

	public static List<Field> getAllClassFields(Class<?> type) {
		List<Field> fields = new LinkedList<>();
		getAllClassFieldsRec(fields, type);
		return fields;
	}
}
