package encapsulation;

public class Pin_parent {
	private int pin;
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public int getPin()
	{
		return pin;
	} 
	
	public void validatePin() {
    if (pin == 1001 || pin == 1234 || pin == 1212)
    {
		  System.out.println("PIN verified!");
	} 
    else 
    {
	    System.out.println("Invalid PIN!");
		        }
		    }
		}




