package controlSystem;

public class Pyramispattern4 {
public static void main(String[] args) {
	for(int i=5; i>=1; i--) //outer loop for new row number
	{
	if(i%2 !=0) { //odd number
	for(int j=5; j>=i; j--) //odd position print star
	{
		System.out.print(" * ");
	}
	System.out.println();
}
	}
	for(int i=2; i<=5; i++) //outer loop for new number
	{
		if(i%2 !=0) {
			for(int j=5; j>=i; j--)
			{
				System.out.print(" * ");
			}
System.out.println();
		}
	}
}
}



	

