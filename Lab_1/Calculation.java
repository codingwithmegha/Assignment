package Lab_1;
import java.util.Scanner;
public class Calculation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no");
	double no1=sc.nextInt();
	System.out.println("enter second n0");
	double no2=sc.nextInt();
	System.out.println("sum is: "+(no1+no2));
	System.out.println("sub is: "+(no1-no2));
	System.out.println("mul is: "+(no1*no2));
	System.out.println("div is: "+(no1/no2));
}
}
