package aggregation;

public class Child_Aggregation {
	int age;
	String color;
	Parent_Aggregation ref;
	public Child_Aggregation(int age , String color, Parent_Aggregation ref)
	{
		this.age=age;
		this.color=color;
		this.ref=ref;
		
	}
	public void display()
	{
		System.out.println("Age is " +age);
		System.out.println("color is " +color);
		System.out.println(ref.name+ref.mark);
	}

	public static void main(String[] args) {
		Parent_Aggregation obj = new Parent_Aggregation("sadiya ",45);
		Child_Aggregation obj1 = new Child_Aggregation(20 ,"red",obj);
		obj1.display();

		// TODO Auto-generated method stub

	}

}
