package com.rp.test.pojos;

public class Person {
	private String name;
	private int age;
	private boolean employed;

	public Person() {
	}

	public Person(String name, int age, boolean employed) {
		this.name = name;
		this.age = age;
		this.employed = employed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEmployed() {
		return employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

}
