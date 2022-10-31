package com.oop.assignment3;

import java.util.concurrent.TimeUnit;

public class Odometer {
	public final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001b[32m";
	public static final String ANSI_RED = "\u001b[31m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	FuelGauge fuelGauge;
	final static double MAX_MILEAGE = 999999;
	double currentMileage;
	double incrementcurrentMileage;

	public Odometer(FuelGauge fuelGauge, double currentMileage) {
		this.fuelGauge = fuelGauge;
		this.currentMileage = currentMileage;

	}

	public void meter() {
		System.out.println(ANSI_GREEN + "\t\t CAR IS RUNNING!");
		for (double i = fuelGauge.currrentAmountOfFuel; i >= 0; i--) {
			fuelGauge.decrementFuel();
			incrementcurrentMileage();
			reset();
			display();
			waiting();
		}
		System.out.println();
		System.out.println(ANSI_RED + "\t\t\tCAR IS STOP!");
		System.out.println(ANSI_PURPLE + "\t\t FUEL TANK IS EMPTY PLEASE FILL IT TANKS!");

	}

	public void incrementcurrentMileage() {
		currentMileage += incrementcurrentMileage + 1;
	}

	public void reset() {

		if (currentMileage > MAX_MILEAGE) {

			currentMileage = 0;
		}

	}

	// getters
	public double getCurrentMileage() {
		return currentMileage;
	}

	public String toString() {
		return "current amount of fuel" + fuelGauge.currrentAmountOfFuel + "gallon" + " current milage" + currentMileage
				+ "miles";
	}

	public void waiting() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void display() {
		if (fuelGauge.currrentAmountOfFuel <= 3) {
			System.out.print(ANSI_RED + "\tFuel is now->" + fuelGauge.getdecrementFuel() + "\t\tCurrent Mileage->"
					+ getCurrentMileage() + ANSI_RESET);
			System.out.println();

		} else {
			System.out.print(ANSI_GREEN + "\tFuel is now->" + fuelGauge.getdecrementFuel() + "\t\tCurrent Mileage->"
					+ getCurrentMileage() + ANSI_RESET);
			System.out.println();

		}

	}
}
