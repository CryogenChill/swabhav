package com.techlab.test;
import com.techlab.model.Rectangle;
import com.techlab.model.Thickness;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle [] rarr = new Rectangle[3];
		Rectangle r1 = new Rectangle(10,50,Thickness.MEDIUM);
		rarr[0]=r1;
		rarr[1]=new Rectangle(5,10);
		rarr[2]=new Rectangle(15,25,Thickness.HIGH);
		printInfo(rarr);
	}
	
	private static void printInfo(Rectangle [] rectArray) {
        for (int i = 0; i < rectArray.length; i++) {  
            System.out.println("Height: "+rectArray[i].getHeight() + ", Width: "+rectArray[i].getWidth()+", Thickness: "+rectArray[i].getThickness());  
        }  
	}
}
