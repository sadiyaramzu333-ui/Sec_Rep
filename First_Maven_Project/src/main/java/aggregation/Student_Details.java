package aggregation;

public class Student_Details {
	String adress;
	Student ref;
	
	public Student_Details(String adress ,Student ref)
	{
		this.adress=adress;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("Address is " +adress);
		System.out.println(ref.name+ref.rollno);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student("sadiya",23);
		Student_Details obj1 = new Student_Details("dua" ,obj);
		obj1.display();

	}

}
