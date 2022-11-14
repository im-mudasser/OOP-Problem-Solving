package com.oop.assignment4;

public class Challenge {

	public static void main(String[] args) {
		int[] arr = { 27, 15, 27, 27, 27, 15, 15, 30, 15, 30, 30, 30 };

		int prevmaxFreq = 0;
		int val = -1;
		for (int i = 0; i < arr.length; i++) {
			int maxfreq = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					maxfreq += 1;

				}
				if (maxfreq > prevmaxFreq) {
					prevmaxFreq = maxfreq;
					val = arr[i];

				} else if (maxfreq == prevmaxFreq) {
					val = Math.min(arr[i], val);

				}
			}
		}
		System.out.println(prevmaxFreq + " " + val);
	}

}
