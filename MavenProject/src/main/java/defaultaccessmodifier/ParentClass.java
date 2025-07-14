package defaultaccessmodifier;

public class ParentClass {
	
	void display() {
		System.out.println("Method is default");
	}

	public static void main(String[] args) {
	ParentClass p = new ParentClass();
	p.display();

	}

}
