package protectedaccessmodifier;

public class ClassParent {
	protected void display() {
		System.out.println("Protected access modifier");
	}
	public static void main(String[] args) {
		ClassParent cp = new ClassParent();
		cp.display();

	}

}
