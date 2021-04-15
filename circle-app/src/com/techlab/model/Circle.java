package com.techlab.model;

public class Circle {
	int radius;
	String color="yellow";
	float pi=3.14f;
	
	public Circle(int radius, String color) {
		this.radius=checkRadius(radius);
		this.color=checkColor(color);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public float calculateArea() {
		return pi*radius*radius;
	}
	
	public float calculatePeri() {
		return pi*radius*2;
	}
	
	public static Circle findBiggestCircle(Circle cirArr[]) {
		Circle BiggestCircle = cirArr[0];
		for (int i = 1; i < cirArr.length; i++) {
			if(cirArr[i].radius>BiggestCircle.radius) {
				BiggestCircle=cirArr[i];
			}
	    }
		return BiggestCircle;
	}
	
	private int checkRadius(int value) {
		if (value>=50) {
			value=50;
		}
		if (value<=10) {
			value=10;
		}
		return value;
	}
	
	private String checkColor(String value) {
		if (value=="red"||value=="blue"||value=="green") {
			return value;
		}
		else {
			return "yellow";
		}
	}
}
