package print;

public class Child extends Parent
{
	
	
	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.sum(3, 9);
		
		

	}

}
