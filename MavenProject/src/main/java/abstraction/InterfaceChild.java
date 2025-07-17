package abstraction;

public class InterfaceChild implements InterfaceParent {
	public void display() {
		System.out.println("I am inside interface");
	}
	
	public static void main(String[] args) {
	InterfaceChild obj = new InterfaceChild();
	obj.display();
	}
}
