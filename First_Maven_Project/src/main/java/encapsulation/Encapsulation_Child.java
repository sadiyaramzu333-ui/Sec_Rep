package encapsulation;

public class Encapsulation_Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation_Parent obj = new Encapsulation_Parent();
		obj.setAge(23);
		System.out.println(obj.getAge());
		obj.setName("sadi");
		System.out.println(obj.getName());
		obj.setPin(1234);
		System.out.println(obj.getPin());

	}

}
