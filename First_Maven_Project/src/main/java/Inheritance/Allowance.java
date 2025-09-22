package Inheritance;

public class Allowance extends Employee {
    double hra;
    double pf;

    Allowance(double basicpay, double deduction, double bonus) {
        super(basicpay, deduction, bonus);
        this.hra = 0.05 * basicpay; 
        this.pf  = 0.20 * basicpay;

       
    }
}

