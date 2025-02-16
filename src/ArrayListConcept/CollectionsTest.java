package ArrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class CollectionsTest {

	public static void main(String[] args) {
		ArrayList<String> browserList = new ArrayList<String>(); 
		browserList.add("chrome"); //0
		browserList.add("firefox"); //1
		browserList.add("edge"); //2
		browserList.add("IE"); //3
		browserList.add("brave"); //4
		browserList.add("safari"); //5
		browserList.add("opera");//6
		
		System.out.println(browserList);
		Collections.sort(browserList);
		System.out.println(browserList);
		
		// Collections.swap(browserList, 2, 3);
		
		Collections.swap(browserList, 0, browserList.size());
		System.out.println(browserList);
		
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(80);
		marksList.add(70);
		marksList.add(60);
		marksList.add(50);
		marksList.add(40);
		
		
		
	}

}
