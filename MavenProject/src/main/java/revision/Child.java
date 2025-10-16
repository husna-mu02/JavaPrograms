package revision;

public class Child implements Parent, Parent1 {
	
	public void displayParent() {
		System.out.println("I am from Parent Class");
	}
	
	public void displayParent1() {
		System.out.println("I am from Parent1 class");
	}
	
	public void display() {
		System.out.println("I am from child class");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.displayParent();
		c.displayParent1();
		c.display();

	}

	
}
