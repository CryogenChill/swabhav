package com.techlab.model;

public class Person {
	public int id;
	public String name;
	public float height;
	public float weight;

	public Person(int id, String name,float height,float weight) {
		this.id=id;
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	public void eat() {
		weight=weight*1.05f;
	}
	public void play() {
		weight=weight*0.9f;
		height=height*1.01f;
	}
}
