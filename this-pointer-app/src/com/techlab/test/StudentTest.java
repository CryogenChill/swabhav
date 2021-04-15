package com.techlab.test;
import com.techlab.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(10,"BTS",21);
		Student s2 = new Student(27,"U2",51);
		Student elder = s1.whoIsElder(s2);
		printInfo(s1);
		printInfo(s2);
		printInfo(elder);
	}
	
	private static void printInfo(Student s) {
		System.out.println("id: "+s.getId()+", name: "+ s.getName()+ ", age: "+s.getAge()+ ", hash: "+s.hashCode());
	}

}
