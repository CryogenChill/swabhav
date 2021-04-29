package com.techlab.model;

public class SavingAccount extends Account{
	private double minBalance = 500;
	double remainingBalance;
	public SavingAccount(int accNo,String accName,double balance){
		super(accNo,accName,balance);
	}

	@Override
	public void withdraw(double amount) {
		remainingBalance = this.balance-amount;
		if (remainingBalance>minBalance) {
			isWithdrawSuccessful = true;
			this.balance=remainingBalance;
		}
		else {
			this.isWithdrawSuccessful = false;
		}
	}
}
