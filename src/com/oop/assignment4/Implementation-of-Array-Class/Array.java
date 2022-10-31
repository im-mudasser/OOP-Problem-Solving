package com.oop.assignment4;

public class Array {
	public int arr[];
	public int size;
	public int newArray[];

	public Array() {

	}

	public Array(int size) {
		this.size = size;
		arr = new int[size];
	}

	public Array(int arr[]) {
		newArray = arr;

	}

	public Array(Array arr) {
	}

	int getAt(int i) {
		return arr[i];
	}

	public void setAt(int i, int val) {
		arr[i] = val;
	}

	public int[] subArray(int pos) {
		int[] myArray = new int[size];
		System.out.println(myArray.length);
		int j = 0;
		for (int i = pos; i < arr.length; i++) {
			myArray[j] = arr[i];
			j++;
		}
		return myArray;

	}

	void pushBack(int a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = a;
				break;
			}
		}
	}

	int popBack() {
		int i = 0;
		int val = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				break;
			}
		}
		i--;
		val = arr[i];
		arr[i] = 0; // remove element
		return val;
	}

	public int insert(int idx, int val) {
		int flag = 0;
		if (idx < 0) {
			flag = -1;
		} else {
			int i;
			for (i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					break;
				}
				// move values from that location
			}
			i--;

			for (int j = i; j >= idx; j--) {
				arr[j + 1] = arr[j];
			}
			arr[idx] = val;
			flag = 1;
		}
		return flag;
	}

	int erase(int index, int val) {
		int flag = 0;
		if (index < 0) {
			flag = -1;
		} else {
			int j = 1;
			for (int i = index + j; i < arr.length; i++) {
				arr[i - 1] = arr[i];

			}
			flag = 1;
		}
		return flag;

	}

	void size() {
		System.out.println("size" + arr.length);

	}

	int length() {
		return arr.length;
	}

	void clear() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}

	}

	void assign(int index, int val) {
		arr[index] = val;
	}

	void copy(int copyArray[]) {

		for (int i = 0; i < copyArray.length; i++) {
			arr[i] = copyArray[i];
		}
	}

	void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	boolean isEmpty() {
		if (arr.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	boolean equal(int copyArray[]) {
		boolean flag = false;
		if (arr.length != copyArray.length) {
			flag = false;
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " " + copyArray[i]);
				if (arr[i] == copyArray[i]) {
					flag = true;
					continue;

				} else {

					flag = false;
					break;

				}
			}

		}
		return flag;

	}

	int sort() {
		return 0;
	}

	void reverse() {
		int j = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			j--;
		}
	}

}
