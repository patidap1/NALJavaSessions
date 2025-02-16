package mapConcept;

import java.util.HashMap;

public class HashMapInternalMechanism {

	public static void main(String[] args) {
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		//default capacity will be 15 here for HashMap
		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("puja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavitra", 30);
		empMap.put("radha", 50);
		empMap.put("deb", 60);
		empMap.put(null, 6);
		
		System.out.println(empMap);
		
		

	}

}
