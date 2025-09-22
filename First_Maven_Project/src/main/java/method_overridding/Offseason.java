package method_overridding;

public class Offseason {
	 public void discount(double amount) 
	 {
	        double discountRate = 0.15;
	        double discountAmount = amount * discountRate;
	        double finalPrice = amount - discountAmount;
	        System.out.println("Off season final Price: " + finalPrice);

}
}
