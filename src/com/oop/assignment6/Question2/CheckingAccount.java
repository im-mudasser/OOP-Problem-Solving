package com.oop.assignment6.Question2;

public class CheckingAccount extends Bank {
	private final static int WRONG_TRANSACTION_CHARGES = 150;

	CheckingAccount(double balance, double AnnualInterestRate) {
		super(balance, AnnualInterestRate);

	}

	public void withDraw(double amountOfWithdraw) {
		System.out.println(
				"*********If you amount is less the balance there will be charages of 150 and per withdraw a charge of 50 is applied*****");
		if (amountOfWithdraw > balance) {
			System.out.println("Transction incompleted because of low balance");
			MonthlyServiceCharges = WRONG_TRANSACTION_CHARGES;
			super.monthlyProc();
		} else {
			super.withDraw(amountOfWithdraw);
			System.out.println("Successfully done!");
		}

	}

	public void monthlyProc() {
		MonthlyServiceCharges = NumberOfWithdrawals * 50;
		super.monthlyProc();
	}
}