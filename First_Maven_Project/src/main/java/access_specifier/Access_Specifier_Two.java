package access_specifier;

public class Access_Specifier_Two extends Access_Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_Specifier_Two obj2 = new Access_Specifier_Two();
		obj2.pubmethod();
		obj2.protmethod();
		obj2.defaultmethod();
		//obj2.privamethod();  private method cannot access outside the class

	}

}
