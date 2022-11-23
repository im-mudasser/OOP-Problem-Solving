package com.oop.assignment6.Question2;

public class Bank {
	protected double balance;
	protected double numberOfDesposistsThisMonth;
	protected double NumberOfWithdrawals;
	protected double AnnualInterestRate;
	protected double MonthlyServiceCharges;

	private final int MONTHS_IN_YEAR = 12;

	Bank(double balance, double AnnualInterestRate) {
		this.balance = balance;
		this.AnnualInterestRate = AnnualInterestRate;
	}

	public void desposite(double amountOfDesposit) {
		this.balance += amountOfDesposit;
		System.out.println(this.balance);
		this.numberOfDesposistsThisMonth++;

	}

	public void withDraw(double amountOfWithdrawal) {
		this.balance -= amountOfWithdrawal;
		this.NumberOfWithdrawals++;

	}

	public void calcInt() {
		double MonthlyInterestRate = (AnnualInterestRate / MONTHS_IN_YEAR);
		double MonthlyInterest = this.balance * MonthlyInterestRate;
		this.balance += MonthlyInterest;
	}

	public void monthlyProc() {
		this.balance -= MonthlyServiceCharges;
		calcInt();
		this.NumberOfWithdrawals = 0.0;
		this.numberOfDesposistsThisMonth = 0.0;
		this.MonthlyServiceCharges = 0.0;
	}

	// getter
	public double getBalance() {
		return this.balance;
	}

	public double getNumberOfWithdrawals() {
		return this.NumberOfWithdrawals;
	}

	public double getMonthlyServiceCharges() {
		return this.MonthlyServiceCharges;
	}

	public double getnumberOfDesposistsThisMonth() {
		return this.numberOfDesposistsThisMonth;
	}

	public String toString() {
		return "Balance : " + this.balance + " Number of Desposists This Month " + this.numberOfDesposistsThisMonth
				+ " Number of with drawals " + this.NumberOfWithdrawals;

	}
}
