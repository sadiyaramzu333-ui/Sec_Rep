package Inheritance;

public class Multi_Child extends Multi_Inter {
	public void diff()
	{
		int a=4;
		int b=2;
		int c= a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_Child obj1 = new Multi_Child();
				obj1.diff();
				obj1.display();
				obj1.sum(3,3);
	
		
				
				
				

	}

}
