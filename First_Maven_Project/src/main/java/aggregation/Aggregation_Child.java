package aggregation;

public class Aggregation_Child {
	int number;
	String bird;
	Aggregation_Parent ref;
	public Aggregation_Child(int number ,String bird, Aggregation_Parent ref)
	{
		this.bird=bird;
		this.number=number;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("Bird is "+bird);
		System.out.println("Number is "+number);
		System.out.println(ref.number+ref.bird);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation_Parent obj = new Aggregation_Parent("peacock",55);
		Aggregation_Child obj1 = new Aggregation_Child(23 ,"parrot",obj);
		obj1.display();

	}

}
