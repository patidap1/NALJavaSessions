package JavaSessions;

import java.util.Arrays;

public class ArrayLiterals {
	
	public static void main(String[] args) {
		// ArrayLiterals - when we already have the data with us
		// int i[] = new int[5]; normal array 
		int i[] = {10,20,30,40}; //0-3 : 4
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]); //AIOB
		
		String browser[] = {"chrome", "firefox", "ie", "edge"};
		System.out.println(Arrays.toString(browser));
		
		Object emp[] = {"Ravi", 30, 12.33, 'm', true};
		System.out.println(Arrays.toString(emp));
		
		for(Object e :emp) {
			System.out.println(e);
		}
		
		
		int k[]= new int[] {10,20,3,40};
		System.out.println(Arrays.toString(k));
		
	}

}
