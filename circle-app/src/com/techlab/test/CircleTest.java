package com.techlab.test;
import com.techlab.model.*;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle [] arr = new Circle[4];
		arr[0]= new Circle(5,"red");
		arr[1]= new Circle(54,"white");
		arr[2]= new Circle(51,"green");
		arr[3]= new Circle(24,"blue");
		System.out.println();
		printInfo(arr[0]);
		printInfo(arr[1]);
		printInfo(arr[2]);
		printInfo(arr[3]);
		System.out.println("Biggest circle is: ");
		printInfo(Circle.findBiggestCircle(arr));
	}
	public static void printInfo(Circle c) {
		System.out.println("radius: "+c.getRadius());
		System.out.println("color: "+c.getColor());
		System.out.println("periemeter: "+c.calculatePeri());
		System.out.println("area: "+c.calculateArea());
		System.out.println();
	}

}
