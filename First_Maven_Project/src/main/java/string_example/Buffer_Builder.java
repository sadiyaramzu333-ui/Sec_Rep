package string_example;

public class Buffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("hello ");
		System.out.println(s);
		StringBuilder s1 = new StringBuilder("hi");
		System.out.println(s1);
		System.out.println(s.append(s1));
		System.out.println(s.append(" world"));
		System.out.println(s.insert(5, " gd morning"));
		System.out.println(s.replace(1, 5, "i"));//replace
		System.out.println(s.delete(3, 13));
		System.out.println(s.reverse());

	}

}
