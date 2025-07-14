package assignment7;

public class OnSeason {
	int totalAmount;
	float finalAmount;
	
	public void discount(){
	this.totalAmount = totalAmount;
			finalAmount = totalAmount * 0.60F;
			System.out.println("Total amount : "+totalAmount);
			System.out.println("Onseason discount applied!! (40%)");
			System.out.println("Now you've to pay only "+finalAmount+" rupees.");
	}
	
	public static void main(String[] args) {
		OnSeason x1 = new OnSeason();
		OffSeason x2 = new OffSeason();
		x1.totalAmount = 4000;
		x2.totalAmount =8000;
		x1.discount();
		x2.discount();
	}
}
