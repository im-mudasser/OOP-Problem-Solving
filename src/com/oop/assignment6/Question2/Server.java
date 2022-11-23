package com.oop.assignment6.Question2;

import java.util.Scanner;

public class Server {
	final static Scanner in = new Scanner(System.in);
	double amount;

	public void userOperations(Bank bank, String userInput) {

		if (userInput.equals("1")) {
			System.out.println("Enter the deposite amount");
			this.amount = in.nextDouble();
			bank.desposite(amount);

		} else if (userInput.equals("2")) {
			System.out.println("Enter the withdraw account");
			this.amount = in.nextDouble();
			bank.withDraw(amount);
			System.out.println(amount);

		} else if (userInput.equals("3")) {
			System.out.println(bank);
			bank.monthlyProc();
			System.out.println(bank);
		} else {
			System.out.println("Wrong input");
		}

	}

}
