package samples;

public class Staticc {

	public static void setNameAge() {
		String name = "HUSNA";
		int age = 23;
		 getNameAge(name, age);
	}
	public static void getNameAge(String name, int age) {
		System.out.println("NAME : "+name);
		System.out.println("AGE : "+age);
	}
	public static void main(String[] args) {
		setNameAge();
	}
}
