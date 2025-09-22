package absraction;

public class Contractor extends Employee {
	int rate;
	double hours;
	public Contractor(int rate ,double hours)
	{
		
	this.rate=rate;
	this.hours=hours;
	}


	



	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double salary = rate*hours;
		System.out.println(salary);
	}
	

	
	
		
	}



	

