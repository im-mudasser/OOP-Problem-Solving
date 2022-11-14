package com.oop.assignment5.Question4;

public class Staff {
	private String name;

	Staff() {
		name = "abc";
	}

	Staff(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name + ",";
	}

}
