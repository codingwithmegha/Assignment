package Method_program;
import java.util.Scanner;
public class method_1 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //creating a scanner class
	System.out.println("Enter a number");
	//read numbers from user
	int num=sc.nextInt();
	//find calling method
	findevenodd(num);

 }
 //create a method
public static void findevenodd(int num)
{
	
	if(num%2==0)
	{
		System.out.println("Even number");
	}
	else {
		System.out.println("Odd number");
	}
}
}