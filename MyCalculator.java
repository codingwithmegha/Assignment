package Lab_2;
import java.util.Scanner;
class AdvanceArithmetic {
	void divisor_sum(int n) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		 n=sc.nextInt();
		if(n<1000) {
		int j=0;
		for (int i=1; i<=n; i++) {
		      if (n%i==0) {
		    	  System.out.println(" "+i);
		    	  
	//return divisor_sum(0);
		    	  j=j+1;}}
		      System.out.println("sum of divisor is:"+j);
		      }}}
class MyCalculator extends AdvanceArithmetic {
	public static void main(String[] args) {
		AdvanceArithmetic c=new AdvanceArithmetic();
       c.divisor_sum(0);
}}
