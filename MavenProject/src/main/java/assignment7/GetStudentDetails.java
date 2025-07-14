package assignment7;

public class GetStudentDetails {
	String name;
	int rollnum;
	GetStudentDetails(String name,int rollnum) {
		this.name = name;
		this.rollnum = rollnum;
	}	
		public void getDetails() {
		System.out.println("Student name : "+name);
		System.out.println("Student Rollno. : "+rollnum);
	}
}
