package collection_package;

import java.util.ArrayList;
import java.util.List;

public class Collection_Class {

	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		System.out.println(obj);
// add method
		obj.add("red");
		obj.add("blue");
		obj.add("yellow");
		obj.add("red");
		System.out.println(obj);
		//set method---to set new element in the collection
		obj.set(1,"black");
		System.out.println(obj);
		//index of ---to return index
		
		System.out.println(obj.indexOf("red"));
		// last indexof()-----	showing last occurrence  of duplicate
		System.out.println(obj.lastIndexOf("red"));
	// contains ---to check element present or not
		System.out.println(obj.contains("yellow"));
		// is empty() 
		System.out.println(obj.isEmpty());
		// remove
		System.out.println(obj.remove(2));
		System.out.println(obj);
		//get 
		System.out.println(obj.get(1));
		System.out.println(obj.size());
		for(int i=0; i<3; i++)    // i<obj.size();
		{
			System.out.println(obj.get(i));
		}
		for(String a:obj)
		{
			System.out.println(a);
		}
	}

}
