package string_example;

public class String_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="sadiya ";
		System.out.println(s);
		String  s1 = new String("HI");
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s.concat("sadi")); //concatenation
		System.out.println(s.toUpperCase()); //to uppercase
		System.out.println(s1.toLowerCase()); //to lowercase
		String a ="";
		System.out.println(a.isEmpty()); //for checking empty or not the string is
		String word="Hai my name is sadiya";
		System.out.println(word.contains("are"));
		System.out.println(s.contains(s1)); 
		String b= "java";
		String c="java";
		String d="Java";
		String e="selenium";
		System.out.println(b.equals(c)); //for checking equal or not
		System.out.println(c.equals(d));
		System.out.println(d.equals(e));
		System.out.println(b.equalsIgnoreCase(d));
		String s2 = new String("java");
		System.out.println(s2.equals(b));//point objects
		System.out.println(s2==b);
	 //false bcoz variable are different(here checking reference)
		int g = 5;
		System.out.println(String.valueOf(g));
		System.out.println(s.charAt(1));
	  
		

}
}