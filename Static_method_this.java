package Statics_program;
public class Static_method_this {
	//instance variable
	String name;
	int age;
	static String city="Delhi";   //static variable
	//Static method to change the value of static variable
	static void change() { //static method
		city="Ghaziabad";}
	    Static_method_this(String name,int age) {     //parameterized constructor
				this.name=name;
				this.age=age;
				}
			void display() {   //user defined method
				System.out.println(name+" "+age+" "+city);
			}
			public static void main(String[] args) {
				Static_method_this.change();    //calling static method with class name
				Static_method_this s1=new Static_method_this("Avi",20);  //creating object
				Static_method_this s2=new Static_method_this("Anjali",21);
			s1.display();
			s2.display();
			}
			}
