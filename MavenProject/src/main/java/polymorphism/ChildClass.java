package polymorphism;

public class ChildClass extends ParentClass {
	
	public void display(String name, int age) {
		System.out.println(name+ " is "+age+ " years old.");
		super.display(name, age); //calls parent class's display method 
		
	}

	public static void main(String[] args) {
		ChildClass c1 = new ChildClass();
		c1.display("Husna ",23);
		
		ParentClass c2 = new ChildClass();
		c2.display("Anu ", 20);
		
	}
	
	

}
