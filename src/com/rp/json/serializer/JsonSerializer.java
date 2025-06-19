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
	public static void toJson(Object obj) {
		if (obj == null) {
			System.out.println("null");
			return;
		}
		Class<? extends Object> clazz = obj.getClass();
		Field[] declaredFields = clazz.getDeclaredFields();

		for (Field field : declaredFields) {
			field.setAccessible(true);
			try {
				System.out.println(field.getName() + " : " + field.get(obj));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}
}
