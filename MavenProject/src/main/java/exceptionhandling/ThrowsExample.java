package exceptionhandling;

public class ThrowsExample {

public static void main(String[] args) throws VotingException {
		int age = 2;
		if (age >= 18) {
			System.out.println("Eligible");
		}
		else {
			throw new VotingException("Not eligible to vote");
		}

		
	}

}
