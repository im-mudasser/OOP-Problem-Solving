package com.oop.assignment4;

public class Address {
	private String lane;
	private String house;

	public Address(String lane, String house) {
		this.lane = lane;
		this.house = house;
	}

	public String getHouse() {
		return house;
	}

	public String getlane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public void setHouse(String house) {
		this.house = house;
	}
}
