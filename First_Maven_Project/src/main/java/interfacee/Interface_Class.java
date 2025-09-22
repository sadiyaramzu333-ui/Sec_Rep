package interfacee;

public class Interface_Class implements Interface_One {

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Class obj1 = new Interface_Class();
		obj1.sum();
		obj1.display();
		Interface_One.dis(); // static method calling    ---interfacename.methodname
		
	
		

	}


}
