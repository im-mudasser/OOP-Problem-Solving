package com.oop.assignment5.Question4;

public class Typist extends Staff {
	int speed;
	String office;

	public Typist() {
		speed = 0;
		office = null;

	}

	public Typist(String name, int speed, String office) {
		super(name);
		this.speed = speed;
		this.office = office;
	}

	public Typist(int speed, String office) {
		this.speed = speed;
		this.office = office;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@Override
	public String toString() {
		return super.toString() + "speed=" + speed + "wph" + ",office=" + office;
	}

}
