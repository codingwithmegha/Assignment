package Test;
import java.util.Scanner;
public class Thread_bank {
	int balance;
	synchronized void deposit(int amount) {
	    balance += amount;
        System.out.println("Deposit : " + amount);
        notify();	
	}
synchronized void withdraw(int amount1) throws InterruptedException{
	while (balance < amount1) {
        System.out.println("Balance is insufficient" + balance +" "  +"please deposit first");
        wait();
}
	balance -= amount1;
System.out.println("remaining Amount: " + balance );
}
public static void main(String[] args) throws InterruptedException {
	Thread_bank b = new Thread_bank();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Amount to deposit:");
   int r=sc.nextInt();
    Thread depositThread = new Thread(()->  {
        b.deposit(r);
    });
    System.out.println("Enter the Amount to Withdraw:");
    int w=sc.nextInt();
    Thread withdrawThread = new Thread(() -> {
        try {
            b.withdraw(w);
        } catch (InterruptedException e) {
           System.err.println(e);
        }
    });
    depositThread.start();
    Thread.sleep(500);
    withdrawThread.start();
    depositThread.join();
    withdrawThread.join();
}
}
