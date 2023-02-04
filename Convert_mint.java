package Object_class;
import java.util.Scanner;
public class Convert_mint {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Input the number of minutes: ");
    int min = sc.nextInt();
    int year1=60*24*365;
    //here the min will convert in year
    long years =(min / year1);
    // and minute will convert in day
    int days = (min / 60 / 24) % 365;
System.out.println("Years: "+years);
System.out.println("Days: "+days);
}
}
