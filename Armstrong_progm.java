package Method_program;
import java.util.Scanner;
public class Armstrong_progm {
	public static void main(String[] args) {
		int num;
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);//take input from user
		num=sc.nextInt();
		armstrongnumber(num);//method calling
	}
	public static void armstrongnumber(int num) {//method declaraion
		//logic to find the armstrong number
		int result=0;
		int a=num;
		while(num>0) {
		int remainder=num%10;
		 result=result+(remainder*remainder*remainder);
		num=num/10;
		}
		if(result==a) {
			System.out.println(a+"  number is Armstrong");
		}
		else {
			System.out.println(a+"   number is not Armstrong");
		}
	}
	}
	   