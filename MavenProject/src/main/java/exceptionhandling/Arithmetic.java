package exceptionhandling;

public class Arithmetic {

	public static void main(String[] args) {
		try {
			int num = 45;
			int d = num/0;
			System.out.println("result = "+d);
			}
		catch(ArithmeticException e) { // can use multiple catch with single try
			System.out.println(e);
		}
		finally {
			System.out.println("This is an arithmetic exception ");
		}
	}

}
