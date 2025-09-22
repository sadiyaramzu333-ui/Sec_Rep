package super_keyword;

public class Super_Child_Constructor extends Super_Parent_Constructor {
	public  Super_Child_Constructor()
	{
		super(5,5);
		System.out.println("This is child constructor");
	}
	public  Super_Child_Constructor(String a)
	{
		super();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Super_Child_Constructor obj1 = new Super_Child_Constructor();
		 Super_Child_Constructor obj2 = new  Super_Child_Constructor("sadiya");
		

	}

}
