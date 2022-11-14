package com.oop.assignment5.Question1;

public class Square extends Rectangle {

	public Square() {
		width = 5.0;
		length = 5.0;
	}

	public Square(double side) {
		width = side;
		length = side;
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);

	}

	public void setSide(double side) {
		width = side;
		length = side;

	}

	public double getSide() {
		double area = super.getArea();
		double side = Math.sqrt(area);
		return side;

	}

	public void setWidth(double side) {
		this.width = side;
	}

	public void setLength(double side) {
		this.length = side;
	}

	@Override
	public String toString() {
		String output = super.toString();
		return output;
	}
}
