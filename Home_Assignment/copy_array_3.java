package Home_Assignment;
//WAP to copy an array by iterating the array
public class copy_array_3 {
	public static void main(String[] args) {        
		//declaring a source array
		char[] copyFrom= {'d','e','c','f','f','e','i','n'};
		////declaring a Destination array
		char[] copyTo=new char[7]; //new array
		System.arraycopy(copyFrom,1,copyTo,1,5);  
		//print the destination array
		System.out.println(String.valueOf(copyTo));
	}
}

