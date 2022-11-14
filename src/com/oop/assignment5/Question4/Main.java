package com.oop.assignment5.Question4;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** CASUAL EMPLOYEE ***");
		Casual c = new Casual("faizan ahmad", 40, "numu", 1000);
		System.out.println(c);
		System.out.println("*** PERMANENT EMPLOYEE ***");
		System.out.println(new Permanent("Mudasser Shahzad", 100, "afinite", 3000));
		System.out.println("*** FACULTY EMPLOYEE ***");
		System.out.println(new Faculty("Ali", "CS", "AI", "OOP"));
		System.out.println("*** Officer EMPLOYEE ***");
		System.out.println(new Officer("Shahzad", "Officer", "18"));
	}

}
