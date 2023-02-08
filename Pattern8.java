package controlSystem;
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
    	int row,c=1,k,i,j;
    	System.out.print("enter the number of rows:");
    	Scanner sc=new Scanner(System.in);
    	row=sc.nextInt();
    	for(i=0; i<row; i++)
    	{
    		for(k=1; k<=row-i; k++)
    			System.out.print(" ");
    	for(j=0; j<=i; j++)
    	{
    		if(j==0||i==0)
    			c=1;
    		else
    			c=c*(i-j+1)/j;
    		System.out.print(" "+c);
    	}
    	System.out.print("\n");
    	}
        }
    }

