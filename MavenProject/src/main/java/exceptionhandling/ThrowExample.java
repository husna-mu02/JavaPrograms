package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age = 4;
		
		if(age >= 18) {
			System.out.println("Eligible for voting.");
		}
		else {
			throw new ArithmeticException("Not eligible for voting.");
		}
	}

}
