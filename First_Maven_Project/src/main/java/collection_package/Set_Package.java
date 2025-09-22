package collection_package;

import java.util.HashSet;
import java.util.Set;

public class Set_Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			
			Set<String> obj = new HashSet<String>();
			
			obj.add("kerala");
			obj.add("india");
			obj.add("america");
			System.out.println(obj);
			Set<String> obj1 = new HashSet<String>();
			obj1.add("bca");
			obj1.add("bcom");
			obj1.add("btech");
			obj1.add("zology");
			System.out.println(obj1);
			
			Set<String> objs = new HashSet<String>();
			objs.add("avjvjhbv");
			objs.add("hjghb");
			objs.add("ggvu");
			objs.add("hjjnk");
			System.out.println(objs);
			System.out.println(obj.addAll(obj1));
			System.out.println(obj);
			System.out.println(obj.contains("kerala"));
			System.out.println(obj.containsAll(obj1));
			System.out.println(obj.isEmpty());
			obj.remove("kerala");
			System.out.println(obj);
			obj.clear();
			System.out.println(obj);
			System.out.println(obj.isEmpty());
			
		


		}
		

	}


