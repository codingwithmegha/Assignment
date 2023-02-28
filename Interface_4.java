package com.cognizant.tax;
interface person{
	void speak();
}
class Student implements person{
	public void speak() {
		System.out.println("This is a Student class");
		}
}
class Teacher implements person{
	public void speak() {
		System.out.println("This is a Teacher class");
		}
}
public interface Interface_4 {
public static void main(String[] args) {
	person obj=new Student();
	obj.speak();
	person obj1=new Teacher();
	obj1.speak();
}
}
