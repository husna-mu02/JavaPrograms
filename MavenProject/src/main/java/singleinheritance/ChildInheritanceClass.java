package singleinheritance;

public class ChildInheritanceClass extends SingleInheritance {
	
	public void newDisplay() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		ChildInheritanceClass obj = new ChildInheritanceClass();
		obj.display();
		obj.newDisplay();

	}

}
