package absraction;

public class Abstract_Child extends Abstraction_Parent{
	@Override
	public void sum() 
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	@Override
	public void diff() {
		// TODO Auto-generated method stub
		int a =3; 
		int b=3;
		int c=a-b;
		System.out.println(c);
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_Child obj1 = new Abstract_Child();
		obj1.sum();
		
		obj1.diff();

	}



	
	
	}
	
			


