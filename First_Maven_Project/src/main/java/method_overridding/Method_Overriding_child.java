package method_overridding;

public class Method_Overriding_child extends  Method_Overriding_Parent {
	public  void Sum(int a, int b)
	{
		super.Sum(2, 5);
		int c=a+b;
		System.out.println(c);
	}
    public int diff()
	
	{
    	System.out.println(super.diff());
		int a =5;
		int b=4;
		int c=a-b;
		return c;
	}


	public static void main(String[] args) {
		
		Method_Overriding_child obj1 = new Method_Overriding_child();
		obj1.Sum(2, 3);
		System.out.println(obj1.diff());
		
		

	}

}
