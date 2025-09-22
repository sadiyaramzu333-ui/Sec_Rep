package super_keyword;

public class Super_Child_Instance extends Super_Parent_Instance {
	String color="red";
public void display()
{
	System.out.println(super.color);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super_Child_Instance obj1 = new Super_Child_Instance();
		System.out.println(obj1.color);
		obj1.display();

	}

}
