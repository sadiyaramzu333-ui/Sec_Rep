package method_overridding;

public class Overriding_Child extends Overridding_Parent{
	

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		super.sum(3,4);
		int c= a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Overriding_Child obj1 = new Overriding_Child();
				obj1.sum(2, 3);
		

	}

}
