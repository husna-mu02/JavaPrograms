package samples;

public class ReverseNum {
	int num = 12345;
	int rev = 0;
	public void reversed() {
		int original = num;
		while(num != 0) {
			int digit = num % 10;
			rev = digit + rev * 10;
			num = num / 10;
		}
		System.out.println("original = "+original);
		System.out.println("reversed = "+rev);	
	}
	
	public static void main(String[] args) {
		ReverseNum obj = new ReverseNum();
		obj.reversed();

	}

}
