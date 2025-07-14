package assignment6;

public class CheckAddition extends Addition{
	
	public void ifDivisible() {
		super.additionResult();
		if(sum % 10 == 0) {
			System.out.println(sum+ " is divisible by 10");
		}
		else {
			System.out.println(sum+ " is not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		 CheckAddition obj = new  CheckAddition();
		 obj.ifDivisible();
	}

}
