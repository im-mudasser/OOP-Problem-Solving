package com.oop.assignment3.Question1;

import java.util.Scanner;

public class NumberArray {
	float arr[];
	Scanner in = new Scanner(System.in);

//	Store a number in any element of the array
//	 Retrieve a number from any element of the array
//	 Return the highest value stored in the array
//	 Return the lowest value stored in the array
//	 Return the average of all the numbers stored in the array
	public static void main(String[] args) {

		NumberArray obj = new NumberArray(10);
		obj.storeNumber();
		obj.printArray();
		obj.retrieveNumber();
		System.out.println("Highest Value : " + obj.highestNumber());
		obj.minNumber();
		System.out.println("Mini Value : " + obj.minNumber());
		obj.average();
		System.out.println("Average : " + obj.average());

	}

	public NumberArray(int sizeOfArray) {
		this.arr = new float[sizeOfArray];

	}

	public void storeNumber() {
		System.out.println("Enter the element in an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextFloat();
		}
	}

	public void retrieveNumber() {
		System.out.println("Enter the index: ");
		int location = in.nextInt();
		System.out.println("Retrieve Number from an index is : " + arr[location]);
	}

	public float highestNumber() {
		float max = -1;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public float minNumber() {
		float min = Float.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public float average() {
		float sum = 0;
		float totalValues = arr.length;
		float average = -1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = sum / totalValues;
		return average;
	}

	public void printArray() {
		System.out.println("Element are : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
