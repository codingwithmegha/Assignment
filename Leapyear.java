package controlSystem;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println("this is a leap year");
		}
		else {
			System.out.println("this is not a leap year");
		}
	}

}
