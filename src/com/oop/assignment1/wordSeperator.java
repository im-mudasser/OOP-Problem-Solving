package com.oop.assignment1;

public class wordSeperator {

	public static void main(String[] args) {
		String str = "StopAndSmellTheRoses";
		String newStr = "";
		wordSeperators(str, newStr);

	}

	private static void wordSeperators(String str, String newStr) {
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				if (i != 0) {
					ch = Character.toLowerCase(ch);
					newStr = newStr + " " + ch;
					continue;
				}

			}
			newStr = newStr + ch;

		}
		System.out.println(newStr);
	}
}
