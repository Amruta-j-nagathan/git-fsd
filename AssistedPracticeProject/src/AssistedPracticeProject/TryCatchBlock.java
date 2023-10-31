package AssistedPracticeProject;

public class TryCatchBlock {

	public static void main(String[] args) {
	     int num1,num2;
	     try {
	    	 num1=0;
	    	 System.out.println("Sending the exception");
	    	 num2= 62/num1;
	    	 System.out.println(num2);
	     }
	     catch(ArithmeticException e) {
	    	 /*This block will only execute if Arithmatic exception
	    	  * occurs in try block
	    	  */
	    	 System.out.println("we can't didvide any number by zero");
	    	 
	    	  
	     }
	     catch(Exception e) {
	    	 /*This is ageneric Exception handle which means it can handle
	    	  * all the exceptions. This will execute if the exception is not 
	    	  * handled by previous catch blocks
	    	  */
	    	 System.out.println("Exception occured");
	    	  
	     }
	     System.out.println("Try-Catch ended");

	}

}
