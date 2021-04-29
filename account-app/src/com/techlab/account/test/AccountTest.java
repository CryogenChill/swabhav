package com.techlab.account.test;
import com.techlab.account.*;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(25, "customer", 3500);
		System.out.println("accno: "+a1.getAccNo());
		System.out.println("accname: "+a1.getAccName());
		System.out.println("bal: "+a1.getBalance());
		a1.deposit(500);
		System.out.println("after deposit of 500 bal is: "+a1.getBalance());
		a1.withdraw(600);
		System.out.println("for withdrawal of 600 transaction is: "+a1.isWithdrawSuccessful+", with bal: "+a1.getBalance());
		a1.withdraw(2950);
		System.out.println("for withdrawal of 2950 transaction is: "+a1.isWithdrawSuccessful+", with bal: "+a1.getBalance());
	}

}
