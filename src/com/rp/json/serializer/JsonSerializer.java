package com.rp.json.serializer;

import java.lang.reflect.Field;

public class JsonSerializer {

	/**
	 * <h1>Phase 1</h1> In toJson(Object obj), for now:
	 * <ol>
	 * <li>Use Reflection to list all declared fields.</li>
	 * <li>For each field, get its name and value.</li>
	 * </ol>
	 */
	public static String toJson(Object obj) {
		if (obj == null) {
			return "null";
		}
		StringBuilder jsonBuilder = new StringBuilder();
		Class<? extends Object> clazz = obj.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();
		
		jsonBuilder.append("{");

		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];
			field.setAccessible(true);
			if (i != 0) {
				jsonBuilder.append(",");
			}
			try {
				jsonBuilder.append(formatValue(field.getName()));
				jsonBuilder.append(":");
				
				jsonBuilder.append(formatValue(field.get(obj)));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		jsonBuilder.append("}");
		return jsonBuilder.toString();
	}

	/**
	 * <h1>Phase 1</h1> In formatValue(Object obj), for now:
	 * <p>Currently not handling nested complex objects or collections</p>
	 */
	private static String formatValue(Object value) {
		if (value == null) {
			return "null";
		}
		if (value instanceof CharSequence || value instanceof Character) {
			return "\"" + value.toString() + "\"";
		} else {
			return value.toString();
		}
	}
}
