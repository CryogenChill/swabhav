package com.techlab.model;
public class Rectangle {
	private int width;
	private int height;
	private int maxValue = 100;
	private int minValue = 1;
	private String thickness = "low";

	public int calculateArea() {
		return width*height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	public void setWidth(int pWidth) {
		width = checkValue(pWidth);
	}
	public void setHeight(int pHeight) {
		height = checkValue(pHeight);
	}
	public void setThickness(String pThickness) {
		thickness = pThickness;
	}
	
	public String getThickness() {
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
