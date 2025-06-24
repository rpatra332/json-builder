package com.rp.test.main;

import com.rp.json.serializer.JsonSerializer;
import com.rp.test.pojos.Person;

public class TestMain {

	public static void main(String[] args) {
		Person person = new Person("Rohit", 10, true);
		System.out.println(JsonSerializer.toJson(person));
		System.out.println(JsonSerializer.toJson(null));
	}

}
