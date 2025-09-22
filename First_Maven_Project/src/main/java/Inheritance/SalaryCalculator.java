package Inheritance;


public class SalaryCalculator extends Allowance {
    double totalSalary;  // instance variable

    // Constructor
    public SalaryCalculator(double basicpay, double deduction, double bonus) {
        super(basicpay, deduction,bonus);   
        
        totalSalary = basicpay + hra - pf - deduction + bonus;
    }
}