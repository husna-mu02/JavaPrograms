package assignment7;

public class User {
	
	private int pin = 1212;
	public void setPin(int pin) {
		this.pin = pin;
		System.out.println("Enter the pin : "+pin);
	}
	
	public int getPin() {
		return this.pin;
	}
	
	
}
