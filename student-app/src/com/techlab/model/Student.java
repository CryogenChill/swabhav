package com.techlab.model;

public class Student {
	int id = 100;
	String name;
	int age;
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setId(int i){
		if(i>=1&&i<=50) {
			id=i;
		}
	}
	public void setName(String n){
		name=n;
	}
	public void setAge(int a){
		if(a>21) {
			a=21;
		}
		if(a<15) {
			a=15;
		}
		age=a;
	}
}
