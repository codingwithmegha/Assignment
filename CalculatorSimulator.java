package Exception_handling;
class CountryNotValidException extends Exception { 
    public CountryNotValidException(String str) {  //constructor
        super(str); //passing messgae to super class
    }
}
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String str) {  //constructor
        super(str);
    }
}
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String str) {  //constructor
        super(str);
    }
}
class TaxCalculator{  //creating TaxCalculator class
     double calculateTax(String empName, boolean isIndian, double empSal)throws Exception { //user define method
        if(isIndian==false) {  // Check if the employee is Indian
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }
        if(empName==null || empName.isEmpty()) {  // Check if the employee name is valid
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }
        double taxAmount=0.0;
        if(empSal>100000 && isIndian==true) {
            taxAmount =(empSal*8)/100;
        }else if (empSal>=50000 && empSal<=100000 && isIndian==true) {
            taxAmount=(empSal*6)/100;
        }else if (empSal>=30000 && empSal<50000 && isIndian==true) {
            taxAmount=(empSal*5)/100;
        }else if (empSal>=10000 && empSal<30000 && isIndian==true) {
            taxAmount=(empSal*4)/100;
        }else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
        return taxAmount;
    }
}
public class CalculatorSimulator {  //main class
    public static void main(String[] args) throws Exception {  //main method
    	TaxCalculator ob=new TaxCalculator();
        try {
        	System.out.println(ob.calculateTax("Ron",false,34000));
            }
            catch (Exception e) {
            System.out.println(e.getMessage());
           }
        try {
        	System.out.println(ob.calculateTax("Tim",true,1000));
            }
            catch (Exception e) {
            System.out.println(e.getMessage());
           }
        try {
            System.out.println(ob.calculateTax("Jack",true,55000));
           } 
        catch (Exception e) {
            System.out.println(e.getMessage());
           }
        try {
            System.out.println(ob.calculateTax(null,true,30000));
           } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

		
        
