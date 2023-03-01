package mypackage;
public class Person {   //class one
private String name;  //private variable 
private int age;
Person(String name,int age){  //parameterized cons
	this.name=name;    
	this.age=age;
	System.out.println("Name :"+name);  //printing the name
	System.out.println("Age :"+age);     //printing the age
}	
}
