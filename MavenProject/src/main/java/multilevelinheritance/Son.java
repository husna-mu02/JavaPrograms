package multilevelinheritance;

public class Son extends Father{
	public void thisDisplay() {
		System.out.println("Son");
	}
	public static void main(String[] args) {
		Son obj = new Son();
		obj.thisDisplay();
		obj.newDisplay();
		obj.display();

	}

}
