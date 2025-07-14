package hierarchicalinheritance;

public class Dog extends  Animal{
	
	public void dogMethod() {
		System.out.println("I am inside child dog class");
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.animalMethod();
		d.dogMethod();
		Cat c = new Cat();
		c.catMethod(); //since cat hasn't any extends in dog, we've to create object of cat
		c.animalMethod();
		
	}
}
