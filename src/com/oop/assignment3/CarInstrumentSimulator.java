package com.oop.assignment3;

public class CarInstrumentSimulator {

	public static void main(String[] args) {
		FuelGauge fuelGauge = new FuelGauge(7);
		Odometer meter = new Odometer(fuelGauge, 999);
		meter.meter();

	}

}
