package Lab_1;
import java.util.Scanner;
public class Swapping {  //creating a class
public static void main(String[] args) { // main class
	int a,b,c; //declare local variable
	System.out.println("enter first number:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("enter second number:");
	Scanner sd=new Scanner(System.in);
	b=sd.nextInt();
	System.out.println("before swapping value of a is:"+a);
	System.out.println("before swapping value of b is:"+b);
	c=a;
	a=b;
	b=c;
	System.out.println("after swapping value of a is:"+a);
	System.out.println("after swapping value of b3 is:"+b);
}
}
