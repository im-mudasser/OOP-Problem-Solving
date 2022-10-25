package com.oop.assignment1;

public class PasswordVerifier {

	public static void main(String[] args) {

		String password = "aqbfre1Q";
		passwordVerifier(password);

	}

	private static void passwordVerifier(String password) {
		boolean countUpperCase = false;
		boolean countLowerCase = false;
		boolean digit = false;
		if (password.length() >= 6) {
			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) {
					countUpperCase = true;
				} else if (Character.isDigit(password.charAt(i))) {
					digit = true;
				} else if (Character.isLowerCase(password.charAt(i))) {
					countLowerCase = true;
				}
			}
			if (countUpperCase && countLowerCase && digit) {
				System.out.println("password is set successfully!");
			}
			if (!countUpperCase) {
				System.out.println("at least one upper case ");
			}
			if (!countLowerCase) {
				System.out.println("at least one lower case");
			}
			if (!digit) {
				System.out.println("at least one digit ");
			}

		} else {
			System.out.println("password should be at least 6 characters long");
		}

	}

}
