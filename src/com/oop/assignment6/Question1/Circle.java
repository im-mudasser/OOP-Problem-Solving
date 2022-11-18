package com.oop.assignment6.Question1;

public class Circle extends BasicShape {
	private long centerX;
	private long centerY;
	private double radius;

	public Circle(long centerX, long centerY, double radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		area = 3.14159 * this.radius * this.radius;
		return area;
	}

	public double getCenterX() {
		return this.centerX;
	}

	public double getCenterY() {
		return this.centerY;
	}

}
