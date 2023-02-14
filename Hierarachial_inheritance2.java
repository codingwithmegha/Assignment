package Inheritance;
class demo{
	void showi() {
		System.out.println("HELLO");
	}
	}
class demo1 extends demo{
	void showj() {
		System.out.println("Welcome");
	}
}
class demo2 extends demo {
	void showz() {
		System.out.println("to java");
	}
}
public class Hierarachial_inheritance2 {
public static void main(String[] args) {
	demo1 ob=new demo1();
	ob.showi();
	ob.showj();
	demo2 ob1=new demo2();
	ob1.showi();
	ob1.showz();
	}
}
