package assignment7;

public class PrintStudentDetails {
	String address = "Rose villa";
	GetStudentDetails g;
	
	PrintStudentDetails(String address, GetStudentDetails g){
		this.address = address;
		this.g = g;
	}

	public void address() {
		g.getDetails();
		System.out.println("Student address : "+address);
	}
	public static void main(String[] args) {
		GetStudentDetails p2 = new GetStudentDetails("Husna M U ", 50);
		PrintStudentDetails p1 = new PrintStudentDetails("Rose villa", p2);	
		p1.address();
	}

}
