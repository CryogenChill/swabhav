package com.techlab.test;

import com.techlab.model.*;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(10,"Audi",23000);
		Programmer p1 = new Programmer(11,"Ubisoft",20000,7000);
		Employee e2 = new Employee(12,"Benq",15000);
		Programmer p2 = new Programmer(13,"Mercedes",40000,5000);
		
		employeePrintInfo(e1);
		programmerPrintInfo(p1);
		employeePrintInfo(e2);
		programmerPrintInfo(p2);
	}

	private static void programmerPrintInfo(Programmer p) {
		employeePrintInfo(p);
		System.out.println("Bonus: "+p.getBonus());
		
	}

	private static void employeePrintInfo(Employee e) {
		System.out.println();
		System.out.println("Id: "+e.getId());
		System.out.println("Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());
	}
}


