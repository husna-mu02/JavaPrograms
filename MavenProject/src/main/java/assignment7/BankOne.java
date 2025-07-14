package assignment7;

public class BankOne {
	
	public void validityCheck(int pin) {
		if(pin == 1001 || pin == 1234 || pin == 1212) {
			System.out.println("Pin verified. Withdrawal allowed.");
		}
		else {
			System.out.println("Invalid pin. Access denied!!");
		}
	}
	
	public static void main(String[] args) {
		User obj = new User();
		obj.setPin(1212);
		obj.getPin();
		BankOne obj1 = new BankOne();
		obj1.validityCheck(1212);
	}
	
}
