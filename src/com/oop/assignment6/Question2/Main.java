package com.oop.assignment6.Question2;

import java.util.Scanner;

public class Main {
	final static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Server server = new Server();
		System.out.println("Enter the name of Account 1.Saving or 2.checking Account 3.exit");
		SavingsAccount savingAccount = new SavingsAccount(1000, 0.0);
		CheckingAccount checkAccount = new CheckingAccount(100, 0.0);
		String userInput = in.next(); // to enter in a system
		String choice = null; // for choice 1.desposite \t 2. withdraw\t 3. exit
		while (true) {
			if (userInput.equals("1")) {
				System.out.println("****************Saving account*********");
				System.out.println("1.desposite \t 2. withdraw\t 3. monthly stats");
				choice = in.next();
				server.userOperations(savingAccount, choice);
			} else if (userInput.equals("2")) {
				System.out.println("***********checking Account**********");
				System.out.println("1.desposite \t 2. withdraw\t 3.final Details");
				choice = in.next();
				server.userOperations(checkAccount, choice);
			} else if (userInput.equals("3")) {
				System.out.println("Logout from the system");
				break;
			} else {
				System.out.println("Invalid input");
				break;
			}

		}

	}
}