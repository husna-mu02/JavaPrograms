package assignment6;

public class PalindromeOrNot {
	
	String originalS1 = "Java";
	String originalS2 = "Malayalam";
	String reversedS1 = "";
	String reversedS2 = "";
	public void reverse() {
		this.originalS1 = originalS1;
		this.originalS2 = originalS2;
		//this.reversedS1 = "";
		//this.reversedS2 = "";
		/*for(int i = originalS1.length()-1; i>=0 ;i--) {
			reversedS1 = reversedS1 + originalS1.charAt(i);
		}
		for(int j =originalS2.length()-1; j>=0; j--) {
			reversedS2 = reversedS2 + originalS2.charAt(j);
		}*/
		this.reversedS1 = new StringBuilder(originalS1).reverse().toString();//toString() used to convert string builder to string
		this.reversedS2 = new StringBuilder(originalS2).reverse().toString();
	}
	
	public void palindrome() {
		if(this.originalS1.equalsIgnoreCase(this.reversedS1)) {
			System.out.println("The given string "+originalS1+" is palindrome.");
			System.out.println("Reversed String : "+reversedS1);
		}
		else {
			System.out.println("The given string "+originalS1+" is not palindrome");
			System.out.println("Reversed String : "+reversedS1);
		}
		
	}
	public void nextPalindrome() {
		if(this.originalS2.equalsIgnoreCase(this.reversedS2)) {
			System.out.println("The given string "+originalS2+" is palindrome.");
			System.out.println("Reversed String : "+reversedS2);
		}
		else {
			System.out.println("The given string "+originalS2+" is not palindrome");
			System.out.println("Reversed String : "+reversedS2);
		}
	}

	public static void main(String args[]) {
		PalindromeOrNot pal = new PalindromeOrNot();
		pal.reverse();
		pal.palindrome();
		pal.nextPalindrome();

	}

}
