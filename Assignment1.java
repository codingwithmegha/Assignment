package Collection;
import java.util.ArrayList;
public class Assignment1 {
int n;//instance variable
public void storeEvenNumber(int n) {
	this.n=n;//to take the number
}
ArrayList<Integer>A1 = new ArrayList<Integer>();//only take integer type array list
public void printEvenNumber() {//user define method
	A1=new ArrayList<Integer>();
	for(int i=2;i<=n;i++){
		if (i%2==0)A1.add(i);
	}
	System.out.println(A1);}
ArrayList<Integer>A2= new ArrayList<Integer>();//only take integer type array list
public void retrieveEvenNumber(int n){//user define method
	for (int num:A1) {
		A2.add(num*2);
		System.out.println(num*2);
}
	System.out.println(A2);
}
public static void main(String[] args) {//main method
	Assignment1  a1=new Assignment1();//main class object
	//call all the method with help of object
	a1.storeEvenNumber(10);
	a1.printEvenNumber();
	a1.retrieveEvenNumber(2);
}
}


