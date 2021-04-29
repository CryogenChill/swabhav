package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(25, "customer", 3500);
		Account a2 = new Account(26, "customer", 4000);
		Account a3 = new Account(25, "customer", 3500);
		System.out.println(a1.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
	}

}