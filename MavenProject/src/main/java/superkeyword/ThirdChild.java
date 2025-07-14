package superkeyword;

public class ThirdChild extends ThirdParent {
	ThirdChild(){
		super(20,30);
		System.out.println("Hey it's me!!");
	}

	public static void main(String[] args) {
		ThirdChild obj = new ThirdChild();
	}

}
