package super_keyword;

public class Super_Child_Method extends Super_Parent_Method{
	public void mult()
	{
		this.show();
		super.display();
		int a=7;
		int b=2;
		int c=a*b;
		System.out.println(c);
	}
	public void show()
	{
		//super.display();
		System.out.println("this is current class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super_Child_Method obj1 = new Super_Child_Method();
				//obj1.display();
		        obj1.mult();
		        System.out.println(obj1.sum(2, 3));
		        
		        //or 
		        
		     int d = obj1.sum(2, 2);
		     System.out.println(d);
}
}