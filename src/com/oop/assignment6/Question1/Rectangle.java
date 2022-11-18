package com.oop.assignment6.Question1;

public class Rectangle extends BasicShape {
	private long width;
	private long length;

	public Rectangle(long width, long length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double calcArea() {
		area = this.length * this.width;
		return area;
	}

	public long getWidth() {
		return this.width;
	}

	public long getLength() {
		return this.length;
	}

}
