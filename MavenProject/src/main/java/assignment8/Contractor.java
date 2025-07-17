package assignment8;

public class Contractor extends Employee {
		int paymentValue;
		float workingHours;
		float CSalary;
		
	Contractor(int paymentValue, float workingHours){
		this.paymentValue = paymentValue;
		this.workingHours = workingHours;
		}
	
	public void calculateSalary() {
		float CSalary = (float) this.paymentValue * this.workingHours;
		System.out.println("Salary : "+CSalary);
	}
		
	}

