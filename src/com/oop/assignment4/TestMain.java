package com.oop.assignment4;

public class TestMain {

	public static void main(String[] args) {
		Address address = new Address("25c", "13");
		Student s1 = new Student("mudasser shhahzad", 1234, address);
		Student s2 = new Student(s1);
		System.out.println(s1.getName() + " " + s1.getId() + " " + s1.address.getlane() + " " + s1.address.getHouse());
		s2.setName("ja wa kam kar");
		System.out.println(s1.getName() + " " + s1.getId() + " " + s1.address.getlane() + " " + s1.address.getHouse());
		// s2.setName("Ali khan");
		s2.setid(341);
		s2.address.setLane("30 c");
		s2.address.setHouse("14");
		System.out.println(s2.getName());
		System.out.println(s2.getName() + " " + s2.getId() + " " + s2.address.getlane() + " " + s2.address.getHouse());
		System.out.println(s1.getName() + " " + s1.getId() + " " + s1.address.getlane() + " " + s1.address.getHouse());
	}

}
