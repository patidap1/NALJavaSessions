package mapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapAndTreeMapConcept {

	public static void main(String[] args) {
		//topcasting between hashmap and Linkedhashmap
		//Map<String, Integer> empMap = new HashMap<String, Integer>();
		//Map<String, Integer> empMap = new LinkedHashMap<String, Integer>();
		Map<String, Integer> empMap = new TreeMap<String, Integer>();  

		empMap.put("nitin", 10);
		empMap.put("ravi", 20);
		empMap.put("puja", 90);
		empMap.put("naveen", 20);
		empMap.put("pavitra", 30);
		empMap.put("rajat", 50);
		empMap.put("radha", 50);
		empMap.put("deb", 60); 
		empMap.put("Tom", 70); //Capital letter will come before the small letters
		empMap.put("1Test", 80); //numbers will go first 
		
		System.out.println(empMap);
		//o/p - {1Test=80, Tom=70, deb=60, naveen=20, nitin=10, pavitra=30, puja=90, radha=50, rajat=50, ravi=20}

	}

}
