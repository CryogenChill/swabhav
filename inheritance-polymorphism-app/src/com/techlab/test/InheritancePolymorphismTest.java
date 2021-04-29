package com.techlab.test;

import com.techlab.model.*;

public class InheritancePolymorphismTest {

	public static void main(String[] args) {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kids());
		atThePark(new Infant());
	}

	private static void atThePark(Man m) {
		m.play();
		m.eat();
		System.out.println();
	}
	
	private static void atThePark(Infant i) {
		i.play();
		System.out.println();
	}

}
