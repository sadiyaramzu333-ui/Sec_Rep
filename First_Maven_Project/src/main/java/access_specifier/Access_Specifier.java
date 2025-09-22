package access_specifier;

public class Access_Specifier {
	public void pubmethod()
	{
		System.out.println("This is public method");
	}
	private void privamethod()
	{
		System.out.println("This is private method");
	}
	void defaultmethod()
	{
		System.out.println("This is default method");
	}
	protected void protmethod()
	{
		System.out.println("This is the protected method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Specifier obj1 = new Access_Specifier();
		obj1.pubmethod();
		obj1.privamethod();
		obj1.protmethod();
		obj1.defaultmethod();

	}

}
