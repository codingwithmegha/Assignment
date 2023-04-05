package Test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class InputOutput {
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose a number 1 or 2 :");
	System.out.println("Press 1 if you want to store the data or");
	int num=sc.nextInt();
	if (num==1) {
	try {
		FileOutputStream f2=new FileOutputStream("C:\\java_OI\\1.txt");
		String s="Hello everyone";
		byte b[]=s.getBytes();
		f2.write(b);
		f2.close();
		System.out.println("done");
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	}
	else {
		try {
			FileInputStream f1=new FileInputStream("C:\\java_OI\\1.txt");
	       int i=0;
	       while((i=f1.read())!=-1){
		  System.out.print((char)i);  //convert it into character
			}
			f1.close();
		}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	}
}




	
