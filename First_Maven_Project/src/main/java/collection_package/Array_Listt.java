package collection_package;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Listt {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("indigo");
		a.add("green");
		a.add("purple");
		System.out.println(a);
		ArrayList<String> b = new ArrayList<String>();
		b.add("apple");
		b.add("cherry");
		b.add("banana");
		System.out.println(b);
		//addall--- to compine two list
		System.out.println(a.addAll(b));
		System.out.println(a);
		System.out.println(b);
		//containsall ----to check one collection is present in another collection
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		//iterate ---
		Iterator<String> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		i.remove(); // remove last element
		System.out.println(a);  
		
	
		
	
	}

}
