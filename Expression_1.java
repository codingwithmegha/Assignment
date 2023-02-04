package Object_class;

public class Expression_1 {
public static void main(String[] args) {
	int d=(101+0)/3;
	System.out.println("(101+0)/3-> "+d);
	double h=3.0e-6*10000000.1;
	System.out.println("(3.0e-6*10000000.1)->"+h);
	boolean flag = true;
	if ( flag == true) {
		System.out.println("(true && true)->"+flag);}
		boolean flag1 = false;
		if ( flag1 == false) {
			System.out.println("(true && true)->"+flag1);}
		boolean result,m = true,n = true;
        result = (m || n);
        System.out.println("((false && false)||(true && true))->" + result);
        boolean result1,m1 = false,n1 = false;
        result = (m1 || n1);
        System.out.println("((false && false)||(true && true))->" + result);
}
}
