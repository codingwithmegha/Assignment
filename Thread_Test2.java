package Thread;
//Create two threads to print even numbers and odd numbers from 1 to 100
//after printing of all even numbers only odd number should print
   class EvenThread extends Thread{   //class 1 extends thread
      public void run() {    //user define method
	        for (int i=1; i<=100; i++) {   // loop from 1 to 100
	            try {
	            	if(i%2==0) {  // even number logic
	                Thread.sleep(100);
	                System.out.print(i);  //print the even numbers
	            	}
	            	else {
	            		System.out.print(" ");  //for printing space
	            	}
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	        }
	       System.out.println(); //for next line
	    }
	}

	class OddThread extends Thread {   //class 2 
	    public void run() {    //method
	        for (int j=1; j<=100; j++) {  //for loop for odd number
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
	public class Thread_Test2 {  //main class
	    public static void main(String[] args) {  //main method
	        EvenThread t= new EvenThread();   //object of eventhread
	       OddThread t1 = new OddThread();   //object of oddthread
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