package assignment8;

public class HDFC implements RBI{
	
	public void recurringDeposit(double amount, int duration) {
		System.out.println("Deposited amount per month = "+amount);
		System.out.println("Duration (in Months) = "+duration);
		System.out.println("Interest Rate = "+interestRate);
		double maturityAmount = (amount*duration) + (amount*duration*(duration+1)*interestRate) / (2 * 12 * 100);
		System.out.println("Maturity Amount = "+maturityAmount);
	}
	
	public static void main(String[] args) {
		HDFC customer1 = new HDFC();
		customer1.recurringDeposit(5000, 12);
	}
	
}
