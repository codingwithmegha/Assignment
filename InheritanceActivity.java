package Lab3_16_feb;
//creating a class 
class Employee{  //creating class
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250;
	double hra=1000;
	public Employee(long Id,String Name,String address,long phone,double salary) {
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=salary;
		}
	void calculateSalary() {  //user define method
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
      System.out.println("Salary for employee " + employeeName + " is: " + salary);
	}

	void calculateTransportAllowance(){
		double transportAllowance = 10/100*basicSalary;
      System.out.println("Transport allowance for employee " + employeeName + " is: " + transportAllowance);
	}
	}
   //manager
	class Manager extends Employee{
		public Manager(long Id,String Name,String address,long phone,double salary) {//using base class to overloading parent constructor
		super(Id,Name,address,phone,salary);
		}
		//@Override
		void calculateTransportAllowance() {
			double transportAllowance = 15*basicSalary /100;
      System.out.println("Transport allowance for manager " + employeeName + " is: " + transportAllowance);
		}
	}
   class Trainee extends Employee{
	   public Trainee(long Id,String Name,String address,long phone,double salary) {//using base class to overloading parent constructor
		super(Id,Name,address,phone,salary);	
		}
	   void calculateSalary() {
			double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
	      System.out.println("Salary for employee " + employeeName + " is: " + salary);
		}
	   void calculateTransportAllowance() {
			double transportAllowance = 15*basicSalary /100;
     System.out.println("Transport allowance for manager " + employeeName + " is: " + transportAllowance);
		}
	}
public class InheritanceActivity {
public static void main(String[] args) {
	Manager m=new Manager(126534,"Peter","chennai_India",237844,65000.00);
	m.calculateSalary();
	m.calculateTransportAllowance();
	Trainee t=new Trainee(29846,"Jack","Mumbai_India",442085,45000.00);
	t.calculateSalary();
   t.calculateTransportAllowance();
	}
}
