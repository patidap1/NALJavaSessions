package JavaSessions;

import java.util.Arrays;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		
		//object array : stores diff types of data, but this is still static array
		// EMP data
		// name(string), age (int), salary (double), Gender (char), isParmament(boolean)

		// all class name start with capital letter
		
		
		Object emp[] = new Object[5]; // 0-4 range
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp)); // non primitive default value is 'null'

		emp[0] = "Naman";
		emp[1] = 30;
		emp[2] = 45.55;
		emp[3] = 'm';
		emp[4] = true;

		System.out.println(Arrays.toString(emp));		
		
		Object emp1[] = new Object[5]; // 0-4 range
		System.out.println(emp1.length);
		System.out.println(Arrays.toString(emp1)); // non primitive default value is 'null'

		emp1[0] = "Ravi";
		emp1[1] = 31;
		emp1[2] = 46.55;
		emp1[3] = 'm';
		emp1[4] = false;

		System.out.println(Arrays.toString(emp1));		
		
	}

}
