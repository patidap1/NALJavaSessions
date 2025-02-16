package StringConcept;

public class StringImmutable {

	public static void main(String[] args) {
		//Immutable - can not be changed
		//Whenever try to add anything to string- it will create new entry in the memory
		
		String s1 = "hello";
		s1 = s1 + "selenium";  //new object will be created
		System.out.println(s1);
		String s2 = "hello"; //heap - 0, scp - 0
		System.out.println(s2);
		
		s1 = s1 + "automation";
		System.out.println(s1);
		
	}

}
