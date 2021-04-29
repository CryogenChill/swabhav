package com.techlab.model;

public abstract class Account {
	int accNo;
	String accName;
	double balance;
	public boolean isWithdrawSuccessful = true;

	Account(int accNo,String accName,double balance){
		this.accNo=accNo;
		this.accName=accName;
		this.balance=balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	
	public abstract void withdraw(double amount);
}
