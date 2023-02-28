package com.cognizant.tax;
interface BankAccount_1{  //create interface
	int account_number=123456789;
	int balance=40000;
	 void deposit();   //by default abstract method
	 void withdraw();    //by default abstract method 
}
class CheckingAccount_1 implements BankAccount_1{  //class implements interface
	public void deposit() {
		int deposit=2000;
		System.out.println("Account_number : "+account_number);
		System.out.println("Balance : "+balance);
		System.out.println("Amount_desposit : "+(balance+deposit)); //amount deposit
	}
	public void withdraw() {
		int withdraw=1000;
		System.out.println("Amount_withdraw : "+(balance-withdraw)); //amount withdraw
	}
}
public interface Interface_3 {   //main interface
	public static void main(String[] args) {  //main method
BankAccount_1 obj=new CheckingAccount_1();
obj.deposit();
obj.withdraw();
}
}

