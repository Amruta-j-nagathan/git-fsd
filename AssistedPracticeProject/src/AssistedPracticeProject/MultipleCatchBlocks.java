package AssistedPracticeProject;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
            int[] numbers = {1, 2, 3};
            int index = 4;
            int result = numbers[index]; // This will cause an ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception: " + e.getMessage());
        }


	}

}
