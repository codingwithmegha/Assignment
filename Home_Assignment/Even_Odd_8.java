package Home_Assignment;
public class Even_Odd_8 {  //main class
	public static void main(String[] args) {   //main method   
		int a[]= {1,2,3,4,5,6,7,8,9,10};//declaration and initializing array
		System.out.println("Even number ");
		for(int i=0;i<a.length;i++) {   
		if (a[i]%2==0) { // checking the even number
		System.out.println(a[i]);
		}}
		System.out.println("Odd number ");
		for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) {// checking the odd number
		System.out.println(a[i]);
		}
		}
		}
	}

