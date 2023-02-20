package Super_keyword;
class add{  //parent class
	int num1;  // variables
	int num2;
	add(int num1,int num2){  //parents class constructor
		this.num1=num1;
		this.num2=num2;
	}
}
class add1 extends add{  //child class inheriting parent class
	int num3;
	add1(int num1,int num2,int num3){  //child class constructor
		super(num1,num2);  //reusing parent constructor
		this.num3=num3;
	}
	void display()  //child class method
	{
		int sum=num1+num2+num3;  //adding three number
		System.out.println("addition :"+sum);  //printing sum
	}
}
public class Super_5 {  //main class
public static void main(String[] args) {   //main method
	add1 ob=new add1(10,30,20);  //object
	ob.display();
}
}
