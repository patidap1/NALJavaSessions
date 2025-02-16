package JavaSessions;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {

		int i[] = new int[4]; // 0-3
		i[0] = 10; // lowest index
		i[1] = 20;
		i[2] = 30;
		i[3] = 40; // highest index

		System.out.println(i.length);
		System.out.println(i); // give memory reference - location in the memory - of no use

		// print the array
		System.out.println(Arrays.toString(i)); // will give you segment view of the array helpful for logging purpose

		System.out.println("--------------------------");

		int t[] = new int[4];
		t[0] = 100; // lowest index
		t[1] = 200;
		t[2] = 300;
		t[3] = 400;

		System.out.println(Arrays.toString(t));
		// print the values of array using loop

		for (int k = 0; k <= 3; k++) { // advantage of for loop- modifications in condition, manipulations can be done
			System.out.println(t[k]);
		}

		for (int m = 0; m <= t.length - 1; m++) { // or m<t.length
			System.out.println(t[m]);
			if (t[m] == 200) {
				System.out.println("HIIII");
			}
		}
		
		// string array 
		String browser[] = new String[4]; // 0-3
		browser[0] = "Chrome"; // default value of the string is always 'Null'
		browser[1] = "InternetExplorer";
		browser[2] = "Safari";
		browser[3] = "FireFox";

		System.out.println(Arrays.toString(browser));

		for (int e = 0; e <= browser.length - 1; e++) {
			System.out.println(browser[e]);
			if (browser[e].equals("Safari")) {
				System.out.println("Lanuch Safari");
				break;
			}
		}
		

		
	}

}
