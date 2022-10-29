package com.oop.assignment3;

public class ParkingTicketSimulator {

	public static void main(String[] args) {

		ParkedCar car = new ParkedCar("Black", "Honda", "City 2018", "ABZ00987", 20);
		ParkingMeter meter = new ParkingMeter(60); // parking time that has been purchased by car
		PoliceOfficer officer = new PoliceOfficer("mudasser", "098887");
		ParkingTicket ticket = officer.writeTicket(car, meter);
		if (ticket != null) {
			System.out.println(ticket);

		} else {
			System.out.println("No fine!");
		}
	}

}
