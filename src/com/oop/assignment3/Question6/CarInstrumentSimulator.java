package com.oop.assignment3.Question6;

public class CarInstrumentSimulator {

	public static void main(String[] args) {
		FuelGauge fuelGauge = new FuelGauge(0);
		Odometer meter = new Odometer(fuelGauge, 999);
		meter.meter();

	}

}
