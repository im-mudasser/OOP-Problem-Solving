package com.oop.assignment4;

public class DayofYear {

	public static void main(String[] args) {
		DayofYear dd = new DayofYear(60);
		dd.print();
	}

	private int val;
//	private static int[] arr = { 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
	private static int[] arr = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static String[] month = { "jan", "feb", "march", "april", "may", "june", "july", "august", "sept", "oct",
			"nov", "dec" };

	public DayofYear(int val) {
		this.val = val;
	}

	void print() {
		int i = 0;
		int n = 0;

		for (i = 0; i < arr.length; i++) {
			n += arr[i];
			int day = -1;
			if (n == val) {
				System.out.println(val + " Day is the month of " + month[i - 1] + " " + day);
				break;
			} else if (n > val) {
				day = val - arr[i - 1];
				System.out.println(day);
				System.out.println(val + " Day is the month of " + month[i - 1] + " " + day);
				break;

			}

		}

	}
}
