package assignment7;

public class OffSeason {
	int totalAmount;
	float finalAmount;
	
	public void discount(){
	this.totalAmount = totalAmount;
			finalAmount = totalAmount * 0.85F;
			System.out.println("Total amount : "+totalAmount);
			System.out.println("Offseason discount applied!! (15%)");
			System.out.println("Now you've to pay only "+finalAmount+" rupees.");
	}
	
}
