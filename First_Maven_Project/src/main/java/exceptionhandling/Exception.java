package exceptionhandling;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {

	    int a=8;
		int b=0;
		int c= a/b;
		System.out.println(c);
     }
    catch(ArithmeticException c)
     {
	   System.out.println("exception handled");
     }
     finally
     {
    	 System.out.println("exit code");
     }
     

     
     

	    try
	    {
		int a[] = {2,4,5,};
		for(int i=0; i<=3;i++)
		{
			System.out.println(a[i]);
		}
	    }
	    catch(ArrayIndexOutOfBoundsException a)
	    {
	    	System.out.println("Error handling");
	    }
	    finally
	    {
	    	System.out.println("exit");
	    }
	    try
	    {
	    
	String s=null;
	
	System.out.println(s.length());
	    }
	  catch(NullPointerException s)
	  {
		  System.out.println("handled");
	  }
	  finally
	  {
		  System.out.println("exitt");
	  }
	    
	    
	
	


	}

}
