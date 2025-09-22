package Inheritance;

public class SalarySlip extends SalaryCalculator{
	
	public SalarySlip(double basicpay, double deduction, double bonus)
	{
		super(basicpay, deduction, bonus);
	}
	public void printSlip()
	{
        System.out.println("--------- Salary Slip ---------");
        System.out.println("Basic Pay   : " + basicpay);
        System.out.println("Deduction   : " + deduction);
        System.out.println("HRA         : " + hra);
        System.out.println("PF          : " + pf);
        System.out.println("Bonus       : " + bonus);
        System.out.println("-------------------------------");
        System.out.println("Total Salary: " + totalSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip s = new SalarySlip(4000,5000,3000);
		s.printSlip();
		
		

	}

}
