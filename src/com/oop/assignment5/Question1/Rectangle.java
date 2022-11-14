package com.oop.assignment5.Question1;

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
		width = 1.0;
		length = 1.0;
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public double getArea() {
		double area = length * width;
		return area;
	}

	public double getPerimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}

	@Override
	public String toString() {
		String output = "Width: " + width + "\nLength: " + length + super.toString();
		return output;
	}

}
