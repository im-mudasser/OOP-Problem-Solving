package com.oop.assignment3.Question7;

public class ParkedCar {
	String carColor;
	String carMake;
	String carModel;
	String carLicenseNumber;
	int numberOfMinutes;

	public ParkedCar(String carColor, String carMake, String carModel, String carLicenseNumber, int numberOfMinutes) {
		this.carColor = carColor;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carLicenseNumber = carLicenseNumber;
		this.numberOfMinutes = numberOfMinutes;
	}

	public int getNumberofMinutes() {
		return numberOfMinutes;
	}

}
