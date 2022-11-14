package com.oop.assignment5.Question4;

public class Casual extends Typist {
	double dailywages;

	public Casual() {
		dailywages = 0.0;
	}

	public Casual(double dailywages) {

		this.dailywages = dailywages;
	}

	public Casual(String name, int speed, String office, double dailywages) {
		super(name, speed, office);
		this.dailywages = dailywages;
	}

	@Override
	public String toString() {
		return super.toString() + ",dailywages=$" + dailywages;
	}

}
