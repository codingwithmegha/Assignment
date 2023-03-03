package Array;
import java.util.Scanner;
//WAP to sum values of an array
public class Array_sum {      //main class
public static void main(String[] args) {      //main method
	int sum=0,i;     //variables
	Scanner sc=new Scanner(System.in);  
	System.out.println("Enter the value of n:");  //enter the value of n
	int n=sc.nextInt();
	System.out.println("Enter the array");  
	for(i=0; i<n; i++) {
		int array[]=new int[n];
		array[i]=sc.nextInt();
		sum=sum+array[i];  //for calculating the sum
		}
	System.out.println("sum is: "+sum);  //for printing the sum
}
}
