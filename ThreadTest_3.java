package Thread;
//build and run the project using thread ThreadTest1 project with run. 
public class ThreadTest_3 extends Thread{
	public void run()  
	    {   
		for(int i=0; i<4; i++) {  //first loop for printing ACB 4 time
			try {
				System.out.print("ACB");  //print ACB
				Thread.sleep(800);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			}
		System.out.print("ACA");  //print ACA one time
		for(int i=0; i<4; i++) {   //second loop for printing BCA 4 time
			try {
				System.out.print("BCA");  //print BCA  
				Thread.sleep(800);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		  } 
		System.out.println("BCB");  //print BCB one time
		}
	    public static void main(String args[])   //main method
	    { 
	    	ThreadTest_3 obj=new ThreadTest_3(); //create the object 
	    	System.out.print("Output Window: ");
	        obj.start();    
	    }    
	}
//acb acb acb acb aca bca bca bca bca bcb
