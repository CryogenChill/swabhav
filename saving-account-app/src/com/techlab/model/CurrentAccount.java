package com.techlab.model;

public class CurrentAccount extends Account{
	private double minBalance = 1000;
	double remainingBalance;
	public CurrentAccount(int accNo,String accName,double balance){
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
