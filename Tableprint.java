package controlSystem;
import java.util.Scanner;
public class Tableprint {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in); //declare scanner class
		System.out.println("enter the number");
		n=sc.nextInt();    //taking input from user
		for(int i=1; i<=10; i++)
		{
			System.out.println(n*i); //print the table 
		}
	}

}
