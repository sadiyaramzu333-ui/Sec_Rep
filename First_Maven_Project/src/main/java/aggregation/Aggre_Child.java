package aggregation;

public class Aggre_Child {
	String subject;
	int age;
	Aggre_Parent ref;
	public Aggre_Child(String subject , int age , Aggre_Parent ref)
	{
		this.subject=subject;
		this.age=age;
		this.ref=ref;
	}
	public void display() 
	{
		System.out.println("Subject is " +subject);
		System.out.println("age is " +age );
		System.out.println(ref.name+ref.mark);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggre_Parent obj = new Aggre_Parent("sadiya ", 67);
		Aggre_Child obj1 = new Aggre_Child("maths", 34,obj);
		obj1.display();

	}

}
