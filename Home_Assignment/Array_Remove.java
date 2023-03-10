package Home_Assignment;
import java.util.Scanner;
// WAP to remove a specfic element of array
     class Array_Remove{
    	 public static void main(String[] args) {  //main method
    		int i;	
    		 Scanner sc=new Scanner(System.in);    //taking value from user
    			System.out.println("Enter the value of n:");
    			int n=sc.nextInt();
    			int array[]=new int[n];  //for entering the array
    		    System.out.println("enter the element of array: ");
    		    for(i=0; i<n; i++) {  //for loop for entering the array
    		    	array[i]=sc.nextInt();
    		    }
    				System.out.println("Enter the element to delete: ");
    				int max=sc.nextInt();
    				for(i=0; i<array.length-1; i++) {  //for loop for checking the array
    					array[i]=array[i+1];
    				}
    						System.out.println("Array after deleting "+max+" is: "+array[i]);  //printing the index 
    			for(i=0; i<(n-array[i]); i++) 
    				System.out.println(i+" ");
    			}
    						}	
    	 
    		
    
