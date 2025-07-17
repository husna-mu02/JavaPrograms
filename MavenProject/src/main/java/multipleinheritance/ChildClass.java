package multipleinheritance;

public class ChildClass implements ParentClass, ParentDetailsClass {
	
	public void displayParent() {
		System.out.println("I am inside Parent Class");
	}
	
	public void parentDetails() {
		System.out.println("I am inside Parent Details Class");
	}
	
	public void childDisplay(String name) {
		System.out.println(" Child name : "+name);
	}
	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.displayParent();
		cc.parentDetails();
		cc.childDisplay("Husna ");
	}

}
