package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s2.setId(31);
		s3.setId(-5);
		s4.setId(65);
		s1.setName("LG");
		s2.setName("Samsung");
		s3.setName("AMD");
		s4.setName("Cooler Master");
		s1.setAge(-5);
		s2.setAge(60);
		s3.setAge(15);
		s4.setAge(25);
		printDetails(s1);
		printDetails(s2);
		printDetails(s3);
		printDetails(s4);
	}

	public static void printDetails(Student R) {
		System.out.println(" Student has id: "+R.getId()+", name:"+R.getName()+", age:"+R.getAge());
	}
}
