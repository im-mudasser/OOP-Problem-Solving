package com.oop.assignment1;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "my name is mudasser";
		String strReplacedWith = "mudasser";
		String strToBeReplaced = "shahzad";
		replaceWth(str, strToBeReplaced, strReplacedWith);
	}

	public static int strLen(String str) {

		if (str == null) {
			return 0;
		}

		if (str.isEmpty()) {
			return 0;
		}

		return 1 + strLen(str.substring(1));
	}

	public static void upperToLowerCase(String str) {
		char[] strArray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

				strArray[i] = (char) (str.charAt(i) + 32);

			}
		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}

	}

	public static void lowertoUpperCase(String str) {
		char[] strArray = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {

				strArray[i] = (char) (str.charAt(i) - 32);

			}
		}
		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}

	}

	public static void replaceWth(String str, String strToBeReplaced, String strReplacedWith) {
		String[] words = str.split("\\s+");
		boolean found = false;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(strReplacedWith)) {
				found = true;
				words[i] = strToBeReplaced;
			} else {
				found = false;

			}
		}
		if (found) {
			for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
		} else {
			System.out.println("not found!");
		}
	}
}
