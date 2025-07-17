package exceptionhandling;

public class Animal {

	public static void main(String[] args) {
		try {
			int a[] = new int[6];
			System.out.println(a[8]);
			a[8] = 100/0;
		}
		
		/*
		 catch(Exception a){       //parent exception, this can work by using single catch
		 System.out.println(a);     
		 }
		 */
		catch(ArithmeticException a) {
			System.out.println(a);
		}
		
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b);
		}
		
		finally {
			System.out.println(" abc");
		}
	}

}
