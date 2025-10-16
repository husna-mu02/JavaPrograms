package automation;

public class ChildClass extends ParentClass {
	public void newDisplay() {
		System.out.println("I am inside newDisplay");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.display();
		c.newDisplay();

	}

}
