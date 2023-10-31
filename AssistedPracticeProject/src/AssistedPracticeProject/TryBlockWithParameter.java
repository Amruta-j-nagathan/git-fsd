package AssistedPracticeProject;

public class TryBlockWithParameter {

	public static void main(String[] args) {
		 int a = 5;
	        int b = 2;

	        try {
	            int result = divideNumbers(a, b);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }

	    static int divideNumbers(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	        return dividend / divisor;

	}

}
