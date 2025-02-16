package mapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//key-value pair
		//non order(index) based collection
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();

		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("puja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavitra", 30);
		empMap.put("rajat", 50);
		empMap.put("radha", 50);
		empMap.put("radha", 60); //duplicate is allowed
		empMap.put("deb", 60);
		empMap.put(null, 6);
		empMap.put(null, 7);
		empMap.put(null, 8);
		empMap.put(null, 9); //allowed  - recent value will be returned
		empMap.put("peter", null);
		
		//.get - supply the key - it will return the value
		System.out.println(empMap.get("ravi")); //20
		System.out.println(empMap.get("tom")); //null
		System.out.println(empMap.get("radha")); //60 - will give latest value
		System.out.println(empMap.get("deb"));
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("peter"));
		
		//prints in any order - does not maintain the order
		System.out.println(empMap);
	}

}
