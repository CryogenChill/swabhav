package com.techlab.test;
import com.techlab.model.*;
public class AccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount a1 = new CurrentAccount(15, "current", 3600);
		SavingAccount a2 = new SavingAccount(25, "saving", 3600);
		System.out.println("accno: "+a1.getAccNo());
		System.out.println("accname: "+a1.getAccName());
		System.out.println("bal: "+a1.getBalance());
		a1.deposit(500);
		System.out.println("after deposit of 500 bal is: "+a1.getBalance());
		a1.withdraw(600);
		System.out.println("for withdrawal of 600 transaction is: "+a1.isWithdrawSuccessful+", with bal: "+a1.getBalance());
		a1.withdraw(2950);
		System.out.println("for withdrawal of 2950 transaction is: "+a1.isWithdrawSuccessful+", with bal: "+a1.getBalance());
		System.out.println("accno: "+a2.getAccNo());
		System.out.println("accname: "+a2.getAccName());
		System.out.println("bal: "+a2.getBalance());
		a2.deposit(500);
		System.out.println("after deposit of 500 bal is: "+a2.getBalance());
		a2.withdraw(600);
		System.out.println("for withdrawal of 600 transaction is: "+a2.isWithdrawSuccessful+", with bal: "+a2.getBalance());
		a2.withdraw(2950);
		System.out.println("for withdrawal of 2950 transaction is: "+a2.isWithdrawSuccessful+", with bal: "+a2.getBalance());
	}

}