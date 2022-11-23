package com.oop.assignment3.Question7;

public class PoliceOfficer {
	String policeOfficerName;
	String badgeNumber;

	public PoliceOfficer(String policeOfficerName, String badgeNumber) {
		this.policeOfficerName = policeOfficerName;
		this.badgeNumber = badgeNumber;
	}

	public ParkingTicket writeTicket(ParkedCar car, ParkingMeter meter) {
		ParkingTicket ticket = null;
		int expireCarTime = car.getNumberofMinutes() - meter.getNumberOfMinutesOfParkingTime();
		if (expireCarTime > 0) {
			ticket = new ParkingTicket(car, this, expireCarTime);

		} else {
			ticket = null;
		}
		return ticket;
	}

}