package com.techlab.model;
public class Rectangle {
	private int width;
	private int height;
	private int maxValue = 100;
	private int minValue = 1;
	private Thickness thickness = Thickness.LOW;
	
	public Rectangle(int width, int height){
		this(width, height, Thickness.LOW);
	}
	
	public Rectangle(int width, int height, Thickness thickness){
		this.width=checkValue(width);
		this.height=checkValue(height);
		this.thickness=thickness;
	}
	
	public int calculateArea() {
		return width*height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Thickness getThickness() {
		return thickness;
	}

	private int checkValue(int value) {
		if (value>=maxValue) {
			value=maxValue;
		}
		if (value<=0) {
			value=minValue;
		}
		return value;
	}
}
