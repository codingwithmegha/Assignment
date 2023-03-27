package Thread;
//Create two threads to print even numbers and odd numbers from 1 to 100
//after printing of all even numbers only odd number should print
   class EvenThread extends Thread{
      public void run() {
	        for (int i=1; i<=100; i++) {   // loop from 1 to 100
	            try {
	            	if(i%2==0) {  //for printing even numbers
	                Thread.sleep(100);
	                System.out.print(i);
	            	}
	            	else {
	            		System.out.print(" ");
	            	}
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	        System.out.println(" ");
	    }
	}

	class OddThread extends Thread {
	    public void run() {
	        for (int j=1; j<=100; j++) {
	            try {
	            	if(j%2!=0) {   // for printing odd numbers
	                Thread.sleep(100);
	                System.out.print(j);
	            	}
	            	else {
	            		System.out.print(" ");
	            	}
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	    }
	}

	public class Thread_Test2 {
	    public static void main(String[] args) {
	        EvenThread t= new EvenThread();
	       OddThread t1 = new OddThread();
	       System.out.println("Even number between 1 and 100");
	        t.start();
	        try {
	            t.join();
	        } 
	        catch(InterruptedException e) {
	            System.out.println(e);
	        }
	        System.out.println("odd number between 1 and 100");
	        t1.start();
	    }
	}