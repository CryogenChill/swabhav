package com.techlab.test;
import com.techlab.model.*;
public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1,"ABC", 1.5f , 75f );
		printInfo(p1);
		p1.eat();
		printInfo(p1);
		p1.eat();
		printInfo(p1);
		p1.play();
		printInfo(p1);
		p1.eat();
		printInfo(p1);
		p1.play();
		printInfo(p1);
	}
	public static void printInfo(Person p) {
		System.out.println("id: "+p.id+", name: "+p.name);
		System.out.println("weight: "+p.height+", height: "+p.height);
		System.out.println();
	}

}
