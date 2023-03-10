package Home_Assignment;
//WAP to copy an array by iterating the array
public class copy_array {
	public static void main(String[] args) {        
		 int arr1[]={9,2,5,3,8}; //Initialize array       
		     int arr2[] = new int[arr1.length]; //Create another array arr2 with passing arr1.length      
		    for (int i=0; i<arr1.length; i++) {     
		        arr2[i]=arr1[i];  //value of arr1 convert into arr2   
		    }       
		    System.out.println("Elements of original array: ");    
		    for(int i=0; i<arr1.length; i++) {     
		       System.out.print(arr1[i] + " "); //show the element of arr1   
		    }     
		 System.out.println();//for new line         
		    System.out.println("Elements of new array: ");    
		    for (int i=0; i<arr2.length; i++) { //show the element of arr2    
		       System.out.print(arr2[i] + " ");}
	}
}

