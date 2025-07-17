package assignment8;

public class FullTimeEmployee extends Contractor{
	
	float ftSalary;
	FullTimeEmployee(int paymentValue){
		super(paymentValue,8);
	}
	
	public void calculateSalary() {
		ftSalary = (float) this.paymentValue * 8;
		System.out.println("Full time employee Salary : "+ftSalary);
	}
	
	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee(34566);
		Contractor c = new Contractor(12345,6);
		
		ft.calculateSalary();
		c.calculateSalary();
	}

}
