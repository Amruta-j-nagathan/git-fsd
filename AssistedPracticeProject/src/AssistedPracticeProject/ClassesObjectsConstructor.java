package AssistedPracticeProject;

class Car {
    // Declare instance variables
    String make;
    String model;
    int year;

    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ClassesObjectsConstructor {

	public static void main(String[] args) {
		// Create an object of the Car class using the constructor
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Call a method to display the car's information
        myCar.displayCarInfo();
		
		

	}

}
