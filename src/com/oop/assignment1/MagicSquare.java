package com.oop.assignment1;

public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int magicSq[][] = new int[3][3];
		int n = magicSq.length;
		int sizeSquare = n * n;
		int i = 0;
		int j = n / 2;

		for (int indexer = 1; indexer <= sizeSquare; indexer++) {
			// If the magic square has a number in it, redo move and go one down
			if (magicSq[i][j] != 0) {
				i += 2;
				j -= 1;
			}
			magicSq[i][j] = indexer;
			if (i == 0 && j == n - 1) // if in top right corner, move down
				i++;
			else {
				i--; // Decrement the row (one row up)
				j++; // Increment the column (One column to the right)
			}
			if (i < 0) {// If row goes higher than top row
				i += n; // i is set to bottom row
			} else if (j == n) {// If number placement is outside of rightmost column
				j -= n; // Maintain row and place # in leftmost column.
			}
		}
//		for (int val = 1; val <= sizeSquare; val++) {
//
//			arr[i][j] = val;
//			System.out.println(" arr[i][j] " + i + " " + +j + "---->" + arr[i][j]);
//			i--;
//			j++;
//			if (i < 0) {
//				i = i + n;
//			}
//			if (j < 0) {
//				j = 1;
//			}
//			if (j == n) {
//				j = 0;
//			}
//			if (i == 0 && j == n - 2) {
//
//				i = 2;
//				j = 0;
//			}
//
//			else if (i == n - 1 && j == 0) {
//				i = 1;
//				j = 2;
//
//			}
//
//		}
		for (int outer = 0; outer < n; outer++) {
			for (int inner = 0; inner < n; inner++) {
				System.out.print(magicSq[outer][inner] + " ");
			}
			System.out.println();
		}
	}

}
