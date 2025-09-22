package access_modifier;

import access_specifier.Access_Specifier;

public class Access_Modifier_One extends Access_Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Modifier_One obj = new Access_Modifier_One();
		obj.protmethod();
		obj.pubmethod();
		Access_Specifier obj1 = new Access_Specifier();
		obj1.pubmethod();
		
	}

}
