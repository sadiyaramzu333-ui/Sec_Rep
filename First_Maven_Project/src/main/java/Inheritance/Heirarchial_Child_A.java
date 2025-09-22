package Inheritance;

public class Heirarchial_Child_A extends Heirarchial_Parent {
	public void sum()
	{
		int a=5;
		int b=8;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heirarchial_Child_A obj1 = new Heirarchial_Child_A();
	obj1.display();
	obj1.sum();
	System.out.println(obj1.a);
	System.out.println(obj1.b);
		

	}

}
