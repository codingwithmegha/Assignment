package controlSystem;
import java.util.Scanner;
public class Naturalno {
	public static void main(String[] args) {
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
for(int i=1; i<=n; i++)
{
	sum=sum+i;
	}
System.out.println("sum of natural no:"+sum);
	}

}
