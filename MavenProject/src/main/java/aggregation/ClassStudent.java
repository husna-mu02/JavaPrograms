package aggregation;

public class ClassStudent {
	
	int age ;
	String name;
	
	ClassSchool c;
	
	ClassStudent(int age, String name, ClassSchool c){
		this.age = age;
		this.name = name;
		this.c = c;
	}
	
	public void newDisplay() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("ClassSchool Detail: ");
		c.display();
	}
	
	public static void main(String[] args) {
		ClassSchool c2 = new ClassSchool(2, 4);
		ClassStudent c1 = new ClassStudent(23, "Husna ",c2);
		c1.newDisplay();

	}

}
