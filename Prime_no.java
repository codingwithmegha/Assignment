package Method_program;
import java.util.Scanner;
public class Prime_no 
  {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		// Read numbers from user
		int num=sc.nextInt();
		//call the method
		findprime(num);	
	}
	// Create a method
	public static void findprime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
		}
		if(count==2) {
			System.out.println(num +" "+ "Prime number");
		}
		else {
			System.out.println(num +" "+ "Not Prime");
		}
	}
}
	

