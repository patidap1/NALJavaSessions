package StringConcept;

public class StringSCP {
	//String constant pool 
	
	public static void main(String[] args) {
		//Methods to create String
		
		//1. String literals
		String s = "hello world";
		
		//2. using new
		String s1 = new String("selenium");
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println("--------------------------");
		
		String t1 = "hello java"; // 1 object will be created in SCP 
		String t2 = "hello java"; // 0 object since it is a duplicate
		
		System.out.println(t1==t2); //true
		
		System.out.println("--------------------------");
		
		String t3 = new String("hello java"); // 2 objects with this approach ->  1- in heap 1- in scp
		
		String t4 = new String("testing"); // 2 objects-> heap -1, scp -1
		String t5 = "testing"; //0 objects -> scp - 0
		String t6 = "testing"; //0 objects -> scp - 0
		String t7 = "testing"; //0 objects -> scp - 0
		String t8 = "testing"; //0 objects -> scp - 0
		
		String t9 = new String("testing"); //1 object will be created -> heap - 1,  scp - 0

		System.out.println(t5 == t6); //true
		System.out.println(t5 == t7); //true
		System.out.println(t5 == t8); //true
		
		System.out.println(t4 == t9); //false - will compare the memory reference instead of SCP
		System.out.println(t4.equals(t9)); //true - contents will be compared here if .equals is used
		System.out.println(t5.equals(t6)); //true
		System.out.println(t4==t5); //false
		System.out.println(t4.equals(t5)); //true
		
		System.out.println("--------------");
		
		String p1 = new String("cypress"); //2 objects = heap-1, scp-1
		String p2 = "Cypress"; //1 object -> heap-0, scp-1
		String p3 = "cypress"; //heap-0, scp-0
		
		System.out.println(p2.equals(p3)); //false
		System.out.println(p2.equalsIgnoreCase(p3)); //true
		System.out.println(p1.equals(p3)); //true
		System.out.println(p1==p3); //false
		
		

	}

}
