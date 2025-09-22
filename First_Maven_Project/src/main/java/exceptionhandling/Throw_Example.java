package exceptionhandling;

public class Throw_Example {

	public static void main(String[] args) throws Throwable {
		int age=14;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new Throwable("not eligible");
		}
		
	

	}

}
