package com.oop.assignment5.Question1;

public class MainQuestion1 {

	public static void main(String[] args) {
		// for square
		System.out.println("*** SQUARE INFO *** ");
		Square s = new Square("Black", true, 5);
		s.setFilled(true);
		s.setSide(34);
		s.setColor("blue");
		System.out.println(s.toString());
		System.out.println();
		// for rectangle
		System.out.println("*** RECTANGLE INFO ***");
		Rectangle r = new Rectangle("pink", true, 3, 4);
		System.out.println("Area" + r.getArea());
		System.out.println("Perimeter " + r.getPerimeter());
		System.out.println(r.toString());
		System.out.println();
		// for circle
		System.out.println("*** CIRCLE INFO ***");
		Circle c = new Circle("Red", true, 10);
		System.out.println("Area: " + c.getArea());
		System.out.println("Perimeter: " + c.getPerimeter());
		System.out.println(c.toString());

	}

}
