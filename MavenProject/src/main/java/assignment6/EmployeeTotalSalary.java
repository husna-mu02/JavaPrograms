package assignment6;

public class EmployeeTotalSalary extends EmployeeCalculation {
	
	float TotalSalary;
	public void printSalary() {
		TotalSalary = basicPay + HRA - PF - deduction + bonus;
	}
	
	public void slip() {
		System.out.println("SALARY SLIP :- ");
		System.out.println("Basic Pay : "+basicPay);
		System.out.println("Deduction : "+deduction);
		System.out.println("Bonus : "+bonus);
		System.out.println("HRA : "+HRA);
		System.out.println("PF : "+PF);
		System.out.println("Total Salary by hand : "+TotalSalary);
	}

	public static void main(String[] args) {
		EmployeeTotalSalary obj = new EmployeeTotalSalary();
		obj.employeeDetails();
		obj.calculation();
		obj.printSalary();
		obj.slip();

	}

}
