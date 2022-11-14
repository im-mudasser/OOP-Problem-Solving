package com.oop.assignment3;

import javax.naming.LimitExceededException;

public class FuelGauge {
	public final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001b[31m";
	double currrentAmountOfFuel;
	double incrementFuel;
	double decrementFuel;
	final static double MAX_FUEL_LIMIT = 15;

	public FuelGauge(double currrentAmountOfFuel) {

		setCurrentFuel(currrentAmountOfFuel);

	}

	public void setCurrentFuel(double currrentAmountOfFuel) {
		try {
			if (currrentAmountOfFuel > MAX_FUEL_LIMIT)
				throw new LimitExceededException(ANSI_RED + "Max LIMIT Exceeded from" + MAX_FUEL_LIMIT + ANSI_RESET);
			else if (currrentAmountOfFuel == 0) {
				throw new NullPointerException(ANSI_RED + "fuel tank is empty please fill it first" + ANSI_RESET);
			}
			this.currrentAmountOfFuel = currrentAmountOfFuel;
		} catch (LimitExceededException e) {
			System.out.println(e);
			System.exit(0);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

	public void incrementFuel() {
		currrentAmountOfFuel = incrementFuel + 1;
	}

	public void decrementFuel() {
		decrementFuel = currrentAmountOfFuel;

		currrentAmountOfFuel = decrementFuel - 1;

	}

	// getter
	public double getdecrementFuel() {
		return decrementFuel;
	}

	public double getCurrentAmountOfFuel() {
		return currrentAmountOfFuel;
	}

	public String toString() {
		return "fuel" + currrentAmountOfFuel + "increment fuel\n" + incrementFuel + "decrement fuel\n" + decrementFuel;
	}

}
