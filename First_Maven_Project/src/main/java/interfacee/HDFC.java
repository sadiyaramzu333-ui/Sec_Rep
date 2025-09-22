package interfacee;

public class HDFC implements  RBI {

	@Override
	public void recurringDeposit(double amount, int duration) {
		// TODO Auto-generated method stub
		 double interest = (amount * duration * INTEREST_RATE) / 100;
	        double maturity = amount + interest;
	        System.out.println("Deposit: " + amount);
	        System.out.println("Duration: " + duration + " years");
	        System.out.println("Maturity Amount: " + maturity);
	
	}
	public static void main(String args[]) {
		HDFC obj = new HDFC();
		obj.recurringDeposit(10000,2);
	}

}
