package Object_class;
import java.util.Scanner;
public class Largest_no {
	public static void main(String[] args) {
		int num1,num2;
		
	    System.out.print("enter 1st number: ");
	    Scanner sc = new Scanner(System.in);
	    num1 = sc.nextInt();
	    System.out.print("enter 2nd number: ");
	    Scanner sc1 = new Scanner(System.in);
	    num2 = sc1.nextInt();
	    if(num1>num2)
	    {
	    	System.out.println("first number is greater: "+num1);
	    	System.out.println("second number is smaller: "+num2);
	    }
	    else if(num2>num1) 
	    {
	    	System.out.println("second number is greatest: "+num2);
	    	System.out.println("first number is smaller: "+num1);
	    }
	}

}
