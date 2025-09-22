package absraction;

public class Full_Time_Employee extends Contractor {
	public Full_Time_Employee(int rate, double hours) {
		super(rate, hours);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		int salary= rate*8;
		 System.out.println("Full-Time Employee Salary: " + salary);
	}
    public static void main(String args[])
    {
    	Contractor obj1 = new Contractor(500,9);
    	Full_Time_Employee obj = new Full_Time_Employee(450,8);
    	obj1.calculateSalary();
    	obj.calculateSalary();
    }
}
