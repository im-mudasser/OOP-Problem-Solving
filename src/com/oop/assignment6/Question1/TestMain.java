package com.oop.assignment6.Question1;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(100, 100, 2);
		Rectangle r = new Rectangle(200, 20);
		ArrayList<BasicShape> arr = new ArrayList<BasicShape>();
		arr.add(r);
		arr.add(c);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) instanceof Circle) {
				System.out.println("CIRCLE AREA-> " + arr.get(i).calcArea());
			} else if (arr.get(i) instanceof Rectangle) {
				System.out.println("RECTANGLE AREA-> " + arr.get(i).calcArea());
			}
		}

	}

}
