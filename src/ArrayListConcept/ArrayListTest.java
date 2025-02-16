package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList - Default Class
		//dynamic array
		//size is not fixed
		//order based
		
		ArrayList ar = new ArrayList(); //vc=0, pc=0
		//creates 10 virtual segments in the memory
		
		System.out.println(ar.size()); //vc=0, pc=0
		
		ar.add(100); //0  [vc=9 pc=1]
		ar.add(200); //1  [vc=8 pc=2]
		
		// .size() to calculate size of the ArrayList
		System.out.println(ar.size()); //2
		
		ar.add(300); //2
		ar.add(400); //3
		
		System.out.println(ar.size()); //4
		
		// .get(indexnumber) to get data at position
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(3));
		
		try { System.out.println(ar.get(4)); }
		catch(IndexOutOfBoundsException e) {
			System.out.println("AIOB");
			System.out.println(e);
		}
		
		ar.add(500);
		System.out.println(ar.get(4));
		System.out.println(ar.size()); //5
		
		// .remove() to remove particular entry
		ar.remove(2); 
		System.out.println(ar.size()); //4
		System.out.println(ar.get(2)); //400
		
		
		System.out.println("---------------------");
		
		// virtual capacity(default size - 10) and physical capacity 
		
		//generic type - can hold any type of data
		ArrayList at = new ArrayList(5);  //vc=5, pc=0
		System.out.println(at.size()); //0
		at.add(100);
		at.add(12.33);
		at.add("tom");
		at.add('c');
		at.add(true);
		System.out.println(at);
		
		//student marks: Integer 
		//Generics Type: Integer
		ArrayList<Integer> marksList = new ArrayList<Integer>(); //vc=10, pc=0
		marksList.add(80);
		marksList.add(70); //vc=8, pc=2
		
		// marksList.add("test"); - other data types will be restricted
		
		System.out.println(marksList.size()); //2
		
		//
		ArrayList<Double> dataList = new ArrayList<Double>(); //vc=10, pc=0
		dataList.add(12.33);
		// dataList.add(200); //error
		dataList.add(200.00);
		System.out.println(dataList);
		
		//
		ArrayList<String> browserList = new ArrayList<String>(); //vc=10, pc=0
		browserList.add("chrome");
		browserList.add("firefox");
		browserList.add("edge");
		browserList.add("IE");
		
		System.out.println(browserList.size()); //4
		System.out.println(browserList.get(1)); //firefox
		
		System.out.println(browserList); //
		
		//empData: name, age, salary, gender, true
		ArrayList<Object> empInfoList = new ArrayList<Object>(); //vc=10, pc=0
		empInfoList.add("Tom");
		empInfoList.add(30);
		empInfoList.add(12.33);
		empInfoList.add('m');
		empInfoList.add(true);
		
		System.out.println(empInfoList.size());
		System.out.println(empInfoList);
		
		for(Object e : empInfoList) {
			System.out.println(e);
		}
	}

}
