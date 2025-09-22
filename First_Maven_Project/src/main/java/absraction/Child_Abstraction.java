package absraction;

public class Child_Abstraction extends Parent_Abstraction{

	@Override
	public void sum() 
	{
		int a =8;
		int b=9;
		int c=a+b;
		System.out.println(c);
	
		
	}
	public void display()
	{
		System.out.println("This is non abstract method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_Abstraction obj1 = new Child_Abstraction();
		obj1.sum();  
		obj1.diff();
		Child_Abstraction obj = new Child_Abstraction();
		obj.display(); //we cannot access child property by creating reference of abstract class.
	}

}
