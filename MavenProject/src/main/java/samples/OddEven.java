package samples;

public class OddEven {
	int num = 23;
	public void check() {
		if(num%2 == 0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}
	}
	
	public static void main(String[] args) {
		OddEven obj = new OddEven();
		obj.check();
	}

}
