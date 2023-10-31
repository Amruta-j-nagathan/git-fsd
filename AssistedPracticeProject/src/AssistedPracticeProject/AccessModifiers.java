package AssistedPracticeProject;



public class AccessModifiers {

	
		public int publicVar = 10;
		private int privateVar = 20;
		protected int protectedVar = 30;
		
		int defaultVar = 40;
		
		public void publicMethod() {
			System.out.println("This is my public method");
		}
		
		public void privateMethod() {
			System.out.println("This is my private method");
		}
		
		public void protectedMethod() {
			System.out.println("This is my protected method");
		}
		
		public void defaultMethod() {
			System.out.println("This is my default method");
		}


		public static void main(String[] args) {
			
			AccessModifiers obj = new AccessModifiers();
			
			System.out.println("Public variable : " + obj.publicVar);
			
			System.out.println("Private variable : " + obj.privateVar);
			
			System.out.println("Protected variable : " + obj.protectedVar);
			
			System.out.println("default variable : " + obj.defaultVar);
			
			obj.publicMethod();
			
			obj.privateMethod();
			
			obj.protectedMethod();
			
			obj.defaultMethod();
		

	}

}
