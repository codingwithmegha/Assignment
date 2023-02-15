package com.cognizant.shapes;
class Rectangle{
double length,breadth,area;
void calculateArea()
{
	area=length*breadth;
	System.out.println("The area of the rectangle is calculated by using the formula length*breadth:  "+area);
}}
public class AreaCalculator {
	public static void main(String[] args) {
		Rectangle ob=new Rectangle();
		ob.length=5;
		ob.breadth=4;
		ob.calculateArea();
		
	}
}
