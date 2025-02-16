package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<String> browserList = new ArrayList<String>(); 
		browserList.add("chrome"); //0
		browserList.add("firefox"); //1
		browserList.add("edge"); //2
		browserList.add("IE"); //3
		browserList.add("brave"); //4
		browserList.add("safari"); //5
		browserList.add("opera");//6
		
		System.out.println(browserList.size());
		
		System.out.println(browserList);
		browserList.add(0, "naveen"); //shifts the location - data will not be lost
		System.out.println(browserList);
		
		browserList.set(0, "chrome1"); //replaces the existing value
		// browserList.add(9, "naveen"); //IOB - IndexOutofBounds		
		System.out.println(browserList);
		
		browserList.remove(0); //remove entry from the list
		System.out.println(browserList);
		
		browserList.removeAll(browserList); //remove everything
		System.out.println();
		
		//List - Immuatable
		List<Integer> ls = Arrays.asList(100,200,300,400); //immutable - if it is create this way
		System.out.println(ls);
		// ls.add(500); //Exception in thread "main" java.lang.UnsupportedOperationException
		System.out.println(ls);
		
		
		
		
	}

}
