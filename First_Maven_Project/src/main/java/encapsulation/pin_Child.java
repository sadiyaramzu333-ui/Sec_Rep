package encapsulation;

public class pin_Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pin_parent obj1 = new Pin_parent();
				obj1.setPin(1234);
		System.out.println(obj1.getPin());
		obj1.validatePin();


	}

}
