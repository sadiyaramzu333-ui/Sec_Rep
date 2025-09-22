package interfacee;

public class Multiple_Interface implements Multiple_Interface_One,Multiple_interface_Two{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_Interface obj1 = new Multiple_Interface();
		obj1.display();
		obj1.show();
		

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is interface two");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is interface one");
	}

}
