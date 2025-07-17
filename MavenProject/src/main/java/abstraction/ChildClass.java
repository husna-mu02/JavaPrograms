package abstraction;

public class ChildClass extends ParentClass{
	
	String name = "Husna";
	int age = 23;
	
	public void printDetails() {		 //method overriding
	System.out.println(name+ " "+ age);	
	}
	
	public static void main(String[] args) {
	ChildClass c = new ChildClass();
	c.display();
	c.printDetails();

	}

}
