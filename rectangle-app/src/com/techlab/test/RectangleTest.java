package com.techlab.test;
import com.techlab.model.*;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(25);
		r1.setThickness("high");
		System.out.println(r1.getWidth());
		System.out.println(r1.getHeight());
		System.out.println(r1.getThickness());
	}
}
