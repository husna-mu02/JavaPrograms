package samples;

public class ReverseFor {
	String original = "malayalam";
	String reversed = "";
	
	public void reverse() {
		this.original = original;
		this.reversed = "";
		for(int i = original.length()-1; i>=0; i--) {
			reversed = reversed + original.charAt(i);
		}
		System.out.println("Original String is "+original);
		System.out.println("Reversed String is "+reversed);
	}
	
	public void palindrome() {
		if(original.equalsIgnoreCase(reversed)) {
			System.out.println("The given String is palindrome");
		}
		else {
			System.out.println("The given String is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		ReverseFor rev = new ReverseFor();
		rev.reverse();
		rev.palindrome();

	}

}
