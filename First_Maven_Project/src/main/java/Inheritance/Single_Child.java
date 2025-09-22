package Inheritance;

public class Single_Child extends Single_Inheritance {
	
	
	public void diff(int a , int b)
	{
		int c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_Child obj1 = new Single_Child();
				obj1.diff(4, 1);
				obj1.sum(4, 4);
				obj1.mult(4, 2);
		Single_Inheritance obj2 = new Single_Inheritance();
		
				obj2.mult(3, 4);
				obj2.sum(3, 3);
				
				

	}

}
