package interfacee;

public interface Interface_One {
	public static final int a=2;
	public static final int b =3;
	public abstract void sum(); // abstract method
	default void display()   // default method
	{
		System.out.println("this is the default method");
	}
	static void dis()
	{
		System.out.println("This is static method");
	}

}
