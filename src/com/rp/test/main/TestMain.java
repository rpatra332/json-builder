package com.rp.test.main;

import com.rp.json.serializer.JsonSerializer;
import com.rp.test.pojos.Person;

public class TestMain {

	public static void main(String[] args) {
		Person person = new Person("Rohit", 10, true);
		JsonSerializer.toJson(person);
		JsonSerializer.toJson(null);
	}

}
