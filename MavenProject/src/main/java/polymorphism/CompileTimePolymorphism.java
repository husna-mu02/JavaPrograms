package polymorphism;

public class CompileTimePolymorphism {
	
	public void display(String name, int age) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	 
	public void display(String place) {
		System.out.println("place : "+place);
	}
	
	public void display() {
		System.out.println("This is compile time polymorphism");
	}
	public static void main(String[] args) {
		CompileTimePolymorphism s1 = new CompileTimePolymorphism();
		s1.display();
		s1.display("Husna ",23);
		s1.display("Thrissur");
	}

}
