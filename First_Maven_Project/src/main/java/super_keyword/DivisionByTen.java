package super_keyword;

public class DivisionByTen extends Sum {  // inherit from Sum

    public void check()
    {
        super.add();  // call parent method (uses a & b)
        
        if (sum % 10 == 0) 
        {
            System.out.println("Divisible by 10");
        } else 
        {
            System.out.println("Not divisible by 10");
        }
    }

    public static void main(String[] args) {
        DivisionByTen obj = new DivisionByTen();
        obj.check();
    }
}
