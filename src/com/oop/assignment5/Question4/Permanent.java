package com.oop.assignment5.Question4;

public class Permanent extends Typist {
	double salary;

	public Permanent() {
		salary = 0.0;
	}

	public Permanent(double salary) {
		this.salary = salary;
	}

	public Permanent(String name, int speed, String office, double salary) {
		super(name, speed, office);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ",salary=$" + salary;

	}

}
