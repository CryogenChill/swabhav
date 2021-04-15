package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name){
		this(id,name,25);
	}
	public Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public Student whoIsElder(Student second) {
		if(this.age>second.age) {
			return this;
		}
		else {
			return second;
		}
	}
}
