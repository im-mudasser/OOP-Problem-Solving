package com.oop.assignment4;

public class Student {
	private String name;
	private int id;

	public Address address;

	public Student(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public Student(Student student) {
		this.name = student.name;
		this.id = student.id;
		this.address = student.address;

	}

	public String getName() {
		return name;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String toString() {
		return address.getHouse() + " " + address.getlane();
	}

}
