package com.techlab.model;

public class ClassA {
	int foo;
	public ClassA(int foo)
	{
		this.foo=foo;
		System.out.println("Inside class A "+foo);
	}
	
	public int getFoo() {
		return foo;
	}
}
