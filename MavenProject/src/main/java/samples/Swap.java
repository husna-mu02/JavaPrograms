package samples;

public class Swap {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap :\n num1 = "+num1+ " and num2 = "+num2);
	}

}
