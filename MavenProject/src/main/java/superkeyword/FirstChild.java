package superkeyword;

public class FirstChild extends FirstParent {
	
	int age = 53;
	
	public void display() {
		System.out.println("Age : "+age);
		System.out.println("Age : "+super.age);
		
	}

	public static void main(String[] args) {
		FirstChild c = new FirstChild();
		c.display();
	}

}
