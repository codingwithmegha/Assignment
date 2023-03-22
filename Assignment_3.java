package Exception_handling;
public class Assignment_3 {  //main class
	public static void main(String[] args) { // main method
	   //-------------ArithmeticException-------------------//
			try {
				  int a=25/0;
					 System.out.println(a);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	    //----------------NumberFormatException--------------//
			try {
					 String s1="megha";
					 System.out.println(Integer.parseInt(s1));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		//------------ArrayIndexOutOfBoundsException---------//
			try {
				 int arr[]=new int[5];
	   			  arr[7]=10;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		//-----------NullPointerException---------------//
			try {
		   		String s=null;
					 System.out.println(s.length());
			    }
			catch(Exception e)
			{
				System.out.println(e);
			}
		//-----------------finally--------------------//
            finally {
			String f="Exception Handling Completed";
			  System.out.println(f);
            }
	}
}

