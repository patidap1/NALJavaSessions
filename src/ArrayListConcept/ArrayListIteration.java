package ArrayListConcept;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("chrome"); // 0
		browserList.add("firefox"); // 1
		browserList.add("edge"); // 2
		browserList.add("IE"); // 3

		System.out.println(browserList);

		// index for loop
		for (int i = 0; i < browserList.size(); i++) {
			System.out.println(browserList.get(i));
			if (browserList.get(i).equals("firefox")) {
				System.out.println("launch firefox");
				break;
			}
		}
		
		System.out.println("--------------");
		
		//for each loop
		for(String e : browserList) {
			System.out.println(e);
			if(e.equals("firefox")) {
				System.out.println("launch firefox");
				break;
			}
		}

	}

}
