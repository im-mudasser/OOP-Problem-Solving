package com.oop.assignment1;

import java.util.ArrayList;

public class uniqueWords {

	public static void main(String[] args) {

		String str = "apple apple banana orange mango mango banana";
		String[] words = {};
		words = str.split("\\s+");
		ArrayList<String> uniqueWord = new ArrayList<>();
		for (int i = 1; i < words.length; i++) {
			boolean found = false;
			for (int j = 0; j < uniqueWord.size(); j++) {
				if (words[i].equals(uniqueWord.get(j))) {

					found = true;

					break;
				}

			}

			if (!found) {
				uniqueWord.add(words[i]);

				found = false;

			}

		}

		System.out.println(uniqueWord);
	}

}
