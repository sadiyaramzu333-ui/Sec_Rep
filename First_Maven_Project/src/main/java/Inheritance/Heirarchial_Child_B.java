package Inheritance;

public class Heirarchial_Child_B extends Heirarchial_Parent {
	public void diff(int a ,int b)
	{
		int c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Heirarchial_Child_B  obj2 = new  Heirarchial_Child_B();
				obj2.display();
		 obj2.diff(5, 1);
	

	}

}
