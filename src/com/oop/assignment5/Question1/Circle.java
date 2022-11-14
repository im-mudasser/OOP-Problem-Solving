package com.oop.assignment5.Question1;

public class Circle extends Shape {
	private double radius;

	// constructor
	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	// setter and getter
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}

	public double getPerimeter() {
		double perimeter = 2 * 3.14 * radius;
		return perimeter;
	}

	@Override
	// toString method
	public String toString() {
		String output = "Radius: " + radius + super.toString();
		return output;
	}
}
