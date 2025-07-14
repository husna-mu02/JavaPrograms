package encapsulation;

public class Parent {
	
	private String name;
	private int age;
	public void setMethod(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getMethod() {
		return name;
	}
	public int getNewMethod() {
		return age;
	}
}
