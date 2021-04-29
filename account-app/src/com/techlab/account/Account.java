package com.techlab.account;

public class Account {
	private int accNo;
	private String accName;
	protected double balance;
	public boolean isWithdrawSuccessful = true;
	public Account(int id, String name, double balance) {
		this.accNo = id;
		this.accName = name;
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
		balance=balance+amount;
	}
	
	public void withdraw(double amount) {
		double remaining  = balance-amount;
		if(remaining>=500) {
			balance=remaining;
			isWithdrawSuccessful = true;
		}
		else{
			isWithdrawSuccessful = false;
		}
	}
}
