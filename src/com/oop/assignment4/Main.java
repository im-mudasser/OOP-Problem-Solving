package com.oop.assignment4;

public class Main {

	public static void main(String[] args) {

		Array obj = new Array(5);
		Array copyArray = new Array(obj);
		int[] array1 = copyArray.getArray();
		System.out.println(copyArray + "   " + obj);

		obj.setAt(0, 1);
		obj.setAt(1, 2);
		obj.setAt(2, 3);
		obj.setAt(3, 4);
		obj.setAt(4, 100);

		boolean val = obj.sort();
		System.out.println(val);
		obj.display();

		// copyArray.setAt(2, 200);
//		System.out.println("**********************");
//		for (int i = 0; i < array1.length; i++) {
//			System.out.println(array1[i]);
//		}
//		obj.display();

		// obj.erase(2, 100);
		// obj.reverse();
		// obj.clear();
		System.out.println();
		// int copyArray[] = { 1, 2, 3 };
		// obj.copy(copyArray);

//		obj.display();
//		System.out.println(obj.equal(copyArray));
		// obj.subArray(2);

	}
}