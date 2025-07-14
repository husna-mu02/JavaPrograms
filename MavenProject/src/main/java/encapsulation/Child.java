package encapsulation;

public class Child {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.setMethod("Husna ", 23);
		System.out.println(p1.getMethod());
		System.out.println(p1.getNewMethod());
	}

}
