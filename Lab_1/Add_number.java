package Lab_1;
import java.util.Scanner;
public class Add_number {  //main class
public static void main(String[] args) {   //main function
	int sum=0,avg=0; //variables
	System.out.println("Input first number:");
	Scanner sc=new Scanner(System.in); //taking input from user
	int num1=sc.nextInt();
	System.out.println("Input second number:");
	int num2=sc.nextInt();
	System.out.println("Input third number:");
	int num3=sc.nextInt();
	System.out.println("Input fourth number:");
	int num4=sc.nextInt();
	System.out.println("Input five number:");
	int num5=sc.nextInt();
        sum=num1+num2+num3+num4+num5; //sum of 5 no
		avg=sum/5;  //avg of 5 no
	System.out.println("The sum of 5 no is : " +sum); //print sum
	System.out.println("The avg of 5 no is : " +avg);  //print avg
	}
}
