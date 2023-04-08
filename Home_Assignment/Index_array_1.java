package Home_Assignment;
//WAP to find the index of an array elemets
import java.util.Scanner;
public class Index_array_1 {
	public static void main(String[] args) {  //main method
		Scanner sc=new Scanner(System.in);    //taking value from user
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int array[]=new int[n];  //for entering the array
	    System.out.println("enter the element of array: ");
	    for(int i=0; i<n; i++) {  //for loop for entering the array
	    	array[i]=sc.nextInt();
	    }
			System.out.println("Enter the element of which the index u want: ");
			int max=sc.nextInt();
			for(int i=0; i<n; i++) {  //for loop for checking the array
				if(array[i]==max){
					System.out.println("Index of "+max+": "+i);  //printing the index 
				}
			}
	}
	}
