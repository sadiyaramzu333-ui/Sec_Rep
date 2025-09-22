package collection_package;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Indigo");
		colors.add("dark blue");
		colors.add("white");
		colors.add("yellow");
		colors.add("Green");
		System.out.println(colors);
		System.out.println(colors.get(1));
		
	for(String a:colors)
	{
		System.out.println(a);
	}
	colors.remove(4);
	System.out.println(colors);
	System.out.println(colors.contains("white"));

}
}
