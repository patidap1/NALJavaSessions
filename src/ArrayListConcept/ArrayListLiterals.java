package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListLiterals {

	public static void main(String[] args) {
		
		//mutable
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "edge"));
		System.out.println(browserList);
		
		browserList.add("safari");
		System.out.println(browserList);
		
		System.out.println("------------------------");
		
		//Immutable ArrayList 
		//create by using Arrays.asList  
		//List is an interface 
		List<String> osList = Arrays.asList("windows", "mac", "linux");
		System.out.println(osList);
		// osList.add("unix"); //unsupportedOperationException during runtime
		System.out.println(osList);
		
		System.out.println("------------------------");
		
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,90,100));
		System.out.println(numList);
		Collections.reverse(numList);
		System.out.println(numList);
		
		
		System.out.println("------------------------");
		
		// Static array to dynamic array (AL):
		String browser[] = {"chrome", "firefox", "edge"};
		List<String> browserNamesList = Arrays.asList(browser);
		System.out.println(browserNamesList.size()); //3
		System.out.println(browserNamesList);
		
		System.out.println("------------------------");
		
		//another way - not recommended
		ArrayList<String> list = new ArrayList<String> () {
			{
				add("java");
				add("python");
				add("csharp");
				
			}
		};
		System.out.println(list.size()); //3
		list.add("ruby");
		System.out.println(list.size()); //4
		
		System.out.println("------------------------");
		//jdk 1.9
		List<Integer> nList = List.of(1,2,3,4,5); //5
		System.out.println(nList.size());
		System.out.println(nList);
		// nList.add(6);//unsupportedOperationException during runtime
		System.out.println(nList);
		
		
	}

}
