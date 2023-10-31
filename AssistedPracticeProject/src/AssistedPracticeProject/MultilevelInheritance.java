package AssistedPracticeProject;

class X{
	public void methodX() {
		System.out.println("class X method");
	}
}

class Y extends X{
	public void methodY() {
		System.out.println("class Y method");
		
	}
	
}

class Z extends Y{
	public void methodZ() {
		System.out.println("class Z method");
	
}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Z obj = new Z();
		obj.methodX();//caling grand parent class method
		obj.methodY();//caling parent class method
		obj.methodZ();//caling local method
	}

}
