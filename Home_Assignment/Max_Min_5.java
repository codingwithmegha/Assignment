package Home_Assignment;
//WAP to find the maximum and minimum value of an array
public class Max_Min_5 {
	  static void maximumNo(int array[]) {  //method name maximumNo
			 int max=array[0];  //5 7 9 
			 for(int i=1; i<array.length; i++)
				 if(max<array[i]) //7
					 max=array[i];
			 System.out.println(max);
			}
		 static void minimumNo(int array[]) {   //method name minimumNo
			 int min=array[0];  //5 7 9
			 for(int i=1; i<array.length; i++)
				 if(min>array[i]) //7
					 min=array[i];
			 System.out.println(min);
		 }
		 public static void main(String[] args) {
			//declaring & initializing array
			 int a[]= {5,7,9,2,10};
			 maximumNo(a); //passing array to method max
			 minimumNo(a);  //passing array to a method min
		}
}
