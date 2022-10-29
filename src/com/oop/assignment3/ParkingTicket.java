package com.oop.assignment3;

public class ParkingTicket {
	ParkedCar car;
	PoliceOfficer policeinfo;
	double fine;
	int expireCarTime;
	final static double BASE_FINE = 25.0;
	final static double HOURLY_FINE = 10.0;

	public ParkingTicket(ParkedCar car, PoliceOfficer policeinfo, int expireCarTime) {
		this.car = car;
		this.policeinfo = policeinfo;
		this.expireCarTime = expireCarTime;
		calculateFine();
	}

	public void calculateFine() {
		if (expireCarTime <= 60) {
			fine = BASE_FINE;
		} else {
			fine = 25 + (expireCarTime / 60) * HOURLY_FINE;
		}

	}

	public String toString() {
		return "MAKE : " + car.carMake + " " + "COLOR : " + car.carColor + " " + "LICENSENUMBER : "
				+ car.carLicenseNumber + " " + "MODEL :" + car.carModel + " \n" + "OFFICER NAME : "
				+ policeinfo.policeOfficerName + " " + "OFFFICER BADGE NUMBER" + policeinfo.badgeNumber + "\n"
				+ "FINE : " + fine;
	}

}
