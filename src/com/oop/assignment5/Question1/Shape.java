package com.oop.assignment5.Question1;

public class Shape {
	private String color;
	private boolean filled;

	// default constructor
	public Shape() {
		color = "green";
		filled = true;
	}

	// constructor that is used to set the color and the filled instances values
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// setter and getters
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// check is this filled
	public boolean isFilled() {
		return filled;
	}

	// toString method that returns the color and the filled values
	public String toString() {
		String output = "\nColor: " + color + "\nFilled: " + filled;
		return output;
	}
}
