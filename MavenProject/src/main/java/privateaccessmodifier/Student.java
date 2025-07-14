package privateaccessmodifier;

public class Student {
	
	private void display() {
		System.out.println("Private access only");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();

	}

}
