package samples;

public class Reverse {
	String animal = "malayalam";
	String reversed = "";
	
	public void rev() {
		this.animal = animal;
		this.reversed = new StringBuffer(animal).reverse().toString();
		System.out.println("Original String = "+animal);
		System.out.println("Reversed String = "+reversed);
	}
	
	public void pal() {
		if(this.animal.equalsIgnoreCase(reversed)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome.");
		}
	}
	
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		obj.rev();
		obj.pal();
		
	}

}
