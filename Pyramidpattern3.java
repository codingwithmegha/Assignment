package controlSystem;

public class Pyramidpattern3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--) //loop for blank space
			{
				System.out.print(" "); //print space
		    }
			for(int k=1; k<=i; k++) //loop for star
			{
			System.out.print("* "); //print star
	}
			System.out.println(); //new line
	}
	}
}
