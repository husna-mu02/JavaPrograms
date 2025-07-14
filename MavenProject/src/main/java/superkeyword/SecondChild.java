package superkeyword;

public class SecondChild extends SecondParent {
	
	public void display() {
		System.out.println("Child class");
	}
	
	public void newDisplay() {
		display();
		super.display();
	}

	public static void main(String[] args) {
		SecondChild obj = new SecondChild();
		obj.newDisplay();
	}

}
