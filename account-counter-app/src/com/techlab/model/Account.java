package com.techlab.model;

public class Account {
	int accNo;
	String accName;
	double balance;
	public boolean isWithdrawSuccessful = true;
	private static int count=0;
	public Account(int id, String name, double balance) {
		super();
		this.accNo = id;
		this.accName = name;
		this.balance=balance;
		count = count+1;
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
	public static int headCount() {
		return count;
	}
	
	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return accNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account o = (Account) obj;
		return this.accNo==o.accNo;
	}
}