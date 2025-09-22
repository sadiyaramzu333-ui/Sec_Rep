package method_overridding;

public class Onseason {
	public void discount(double amount)
	{
		double discountrate=0.40;
		double discountamount= amount*discountrate;
		double finalprice = amount-discountamount;
		System.out.println("Onseason Final Price: " + finalprice);
	}

}
