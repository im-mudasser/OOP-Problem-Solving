package com.oop.assignment6.Question2;

public class SavingsAccount extends Bank {
	private boolean status;
	private final static long MIN_LIMIT = 25000;
	private final static int SERVICE_CHARGES = 100;
	private final static int WITH_DRAW_LIMIT = 4;

	SavingsAccount(double balance, double AnnualInterestRate) {
		super(balance, AnnualInterestRate);
	}

	public boolean accountStatus() {
		if (balance >= MIN_LIMIT) {
			this.status = true;
		} else {
			this.status = false;
		}
		return this.status;
	}

	@Override
	public void withDraw(double amountOfWithdrawal) {
		balance -= amountOfWithdrawal;
		if (accountStatus()) {
			this.balance += amountOfWithdrawal;
			super.withDraw(amountOfWithdrawal);
			System.out.println("Successfull!");
		} else {
			balance += amountOfWithdrawal;
			System.out.println("Do not withdraw because your account is deactive now");
		}

	}

	@Override
	public void desposite(double amountOfDesposit) {
		balance += amountOfDesposit; // for check if the account of despoiste brings the balance 25000
		System.out.println("desposite " + accountStatus());
		if (accountStatus()) { // check if account is active;
			balance -= amountOfDesposit;// minus the amount thats check the balance line number 40
			super.desposite(amountOfDesposit);
			System.out.println("Successfull *!");
		} else {
			balance -= amountOfDesposit;
			System.out.println("Does not desposite because account is inactive");
		}

	}

	@Override
	public void monthlyProc() {
		if (NumberOfWithdrawals > WITH_DRAW_LIMIT) {
			MonthlyServiceCharges += SERVICE_CHARGES * (NumberOfWithdrawals - 4);
			balance -= MonthlyServiceCharges; // if the montly services charges falls down then 25000
			if (accountStatus()) {
				balance += MonthlyServiceCharges; // add amount which is cut during in line 56
				super.monthlyProc();
			} else {
				balance += MonthlyServiceCharges;
				super.monthlyProc();
			}

		} else {
			super.monthlyProc();
		}
	}

	@Override
	public String toString() {
		return "Currrent Status : " + accountStatus() + " " + super.toString();
	}

}
