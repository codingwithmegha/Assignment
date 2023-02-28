package com.cognizant.tax;
abstract class Shapes_2 {
	abstract void calculateArea();
}
class Circle extends Shapes_2{
	void calculateArea() {
		int radius=3;  //local variable
		double Radius=3.14*radius*radius;  //calculating radius 
		System.out.println("The area of circle is :"+Radius);  //printing radius
		}
	}
class Rectangle extends Shapes_2{
	void calculateArea() {
		int length=10,breadth=4;  //local variable
		int area=length*breadth;   //calculating area by length*breadth
		System.out.println("The area of Rectangle is :"+area);   //printing the area
		}
}
public class Abstract_4 {  //main class
	public static void main(String[] args) {  //main method
		Shapes_2 obj=new Circle();
		obj.calculateArea();
		Shapes_2 obj1=new Rectangle();
		obj1.calculateArea();
	}
}

