package com.techlab.test;
import com.techlab.model.*;

public class CrudableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doDataBaseOperations(new CustomerDB());
		doDataBaseOperations(new InvoiceDB());
		doDataBaseOperations(new DepartmentDB());
	}
	private static void doDataBaseOperations(ICrudable x) {
		x.create();
	}
}