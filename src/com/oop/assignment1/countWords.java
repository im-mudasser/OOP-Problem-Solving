package com.oop.assignment1;

public class countWords {

	public static void main(String[] args) {
		int n = 5;
		int matrix[][] = new int[n][n];
		int i = 0;
		int j = n / 2;

		for (int value = 1; value <= n * n; value++) {
			if (matrix[i][j] > 0) {
				i += 2;
				j--;

			}
			matrix[i][j] = value;
			if (i == 0 && j == n - 1) {
				i++;
			} else {
				i--;
				j++;
			}

			if (i < 0) {
				i = i + n;

			} else if (j == n) {
				j -= n;
			}

		}

		// print
		for (int outer = 0; outer < matrix.length; outer++) {
			for (int inner = 0; inner < matrix.length; inner++) {
				System.out.print(matrix[outer][inner] + "\t");
			}
			System.out.println();
		}
	}

}

//int count = 0;
//String spaceAtEnd = " ";
//String str = "Four score and seven years ago";
//str = str + spaceAtEnd;
//for (int i = 0; i < str.length(); i++) {
//	if (str.charAt(i) == ' ') {
//		count++;
//	} else {
//		continue;
//	}
//}
//System.out.println(count);