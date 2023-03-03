package Array;
import java.util.Scanner;
// WAP to calculate the average value of array elements
public class Array_avg {   //main class
public static void main(String[] args) {  //main method
	int sum=0,i,avg=0;  //variables
	Scanner sc=new Scanner(System.in);  
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	System.out.println("Enter the array");
	for(i=0; i<n; i++) {  //for loop for entering the array
		int array[]=new int[n];
		array[i]=sc.nextInt();
		sum=sum+array[i];  //calculating the sum
	    avg=sum/n;   //calculating the average
	}
 	System.out.println("sum is: "+sum);  //printing the sum
	System.out.println("Average is: "+avg);  //printing the average
}
}
