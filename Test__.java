package Exception_handling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {  //constructor
		super(str); //call the constructor of parent exception
	}
}
public class Test__ {
	static void checkage(String name) throws InvalidAgeException {
	  if(name=="palabi") {
		  System.out.println(name);
	  }
	}
public static void main(String[] args) {
	 //-------------ArithmeticException-------------------//
	try {
		  int a=25/0;
			 System.out.println(a);
	}
	catch(Exception e)
	{
		System.out.println("Invalid division");
	}
	//----------------NumberFormatException--------------//
	try {
			 String s1="megha";
			 System.out.println(Integer.parseInt(s1));
	}
	catch(Exception e)
	{
		System.out.println("Format mismatch");
	}
	//----------------Accessing an invalid index in array-----------------//
			try {
				 int arr[]=new int[5];
	   			  arr[7]=10;
			}
			catch(Exception e)
			{
				System.out.println("index is invaild");
			}
     //------------ArrayIndexOutOfBoundsException---------//
			try {
				 int arr[]=new int[5];
	   			  arr[7]=10;
			}
			catch(Exception e)
			{
				System.out.println("Array index is invalid");
			}
	
		/////////////////////////////////////////////////////////	
	     try {
				checkage("Pallabi");
			}
			catch(InvalidAgeException e) {
				System.out.println("My Exception[pallabi]");
			}	
	     finally {
				String f="Exception Handling Completed";
				  System.out.println(f);
	            }
}
}
