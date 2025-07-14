package assignment6;

public class EmployeeCalculation extends EmployeeGetDetails {
	
	float HRA;
	float PF;
	public void calculation() {
		HRA = basicPay * 0.05F;
		PF = basicPay * 0.2F;
		
	}
}
