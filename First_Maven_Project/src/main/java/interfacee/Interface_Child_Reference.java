package interfacee;

public class Interface_Child_Reference implements Interface_Reference {

	

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a =9;
		int b=8;
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_Reference obj1 = new Interface_Child_Reference();
		obj1.sum();

	}

}
