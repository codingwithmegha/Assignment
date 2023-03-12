package Home_Assignment;
import java.util.Scanner;
// WAP to remove a specfic element of array
     class Array_Remove_2{
    	 public static void main(String[] args) {  //main method
    		 Scanner sc=new Scanner(System.in);    //taking value from user
    			System.out.println("Enter the value of n:");
    			int n=sc.nextInt();
    			int array[]=new int[n];  //for entering the array
    		    System.out.println("enter the element of array: ");
    		    for(int i=0; i<n; i++) {  //for loop for entering the array
    		    	array[i]=sc.nextInt();
    		    }
    				System.out.println("Enter the element to delete: ");
    				int max=sc.nextInt();
    				for(int i=0; i<array.length; i++) {  //for loop for checking the array
    					if(array[i]==max);
    					{
    						for(int j=i; j<array.length-1; j++) {  //for loop for checking the array
    	    					array[j]=array[j+1];
    	    					array[j+1]=0;
    						}
    					}
    				}
    	 }
     }
     
