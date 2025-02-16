package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "hello Hi this is my java code and i am so happy";
		// String is behaving as array of chars
		System.out.println(str.length()); // 41 --> 0 to 40
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(40));

		// System.out.println(str.charAt(41)); //SIOB - StringIndexOutOfBoundsException
		// System.out.println(str.charAt(-1)); //SIOB - StringIndexOutOfBoundsException

		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('i')); // always start from start position - give you first occurrence of char
												// passed

		// System.out.println(str.indexOf('i', 2)); ///X
		System.out.println("find the nth occurrence");
		
		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // 11 - will give 2nd occurrence of 'i'
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1)); //14 -  will give 3rd occurrence of 'i'
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1)+1)); // 34 - will give 4th occurrence of 'i'

		// exercise - do it for third occurrence of i

		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Java")); // -1 if string/char is not available it will return '-1'
		System.out.println(str.indexOf('z')); // -1

		System.out.println(str.indexOf("naveen")); // -1

		String mesg = "welcome admin";

		if (mesg.indexOf("admin") == 8) {

			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// trim:
		String sr = "   hello    selenium    ";
		System.out.println(sr.trim()); // trim removes the heading the trailing spaces not the middle ones

		// replace: char
		String dob = "01-01-1990"; // 01/01/1990
		System.out.println(dob.replace('-', '/'));

		// replace: String
		String ms = "hello Selenium with java";
		System.out.println(ms.replace("java", "python"));
		System.out.println(sr.replace(" ", "")); // remove all the spaces

		// cases: toUpper // toLower
		String us = "hi this is a java code";
		System.out.println(us.toUpperCase());
		System.out.println(us.toLowerCase());

		// split: split function returns array of String
		String lang = "Java_Python_Ruby_JavaScript";
		String lg[] = lang.split("_"); // split function returns array of String
		System.out.println(lg[0]);
		System.out.println(lg[3]);
		System.out.println(Arrays.toString(lg));

		//
		String top = "xXhelloseleniumXxXjavaXxXXTestingXxXAutomationxxX";

		String tp[] = top.split("xX");
		System.out.println(tp[0].length()); // blank: return nothing - to check add .length()
		System.out.println(tp[1]);
		System.out.println(tp[2]);
		System.out.println(tp[3]);
		System.out.println(tp[4]);
		System.out.println(Arrays.toString(tp));

		// System.out.println(tp[5]); //AIOB - index out of bounds exception

		// if it exist at the end - does not get counted - it check if it exist before

		//
		String data = "Tom;30;SDET;Pune;India;IBM"; // semi colon separated data
		String dt[] = data.split(";");
		System.out.println(dt[0]);

		for (String e : dt) {
			System.out.println(e);
			if (e.equals("SDET")) {
				System.out.println("increase the salary");
			}
		}

		System.out.println(Arrays.toString(dt));

		System.out.println("---------------------");

		// escaping the character
		String empData = "Tom|30|SDET|Pune|India|IBM";
		String emp[] = empData.split("|");
		System.out.println(emp[0]); // T - since java uses it differently - consider | as OR operator
		System.out.println(Arrays.toString(emp));

		String emp1[] = empData.split("\\|"); // '\\' escape character
		System.out.println(emp1[0]); // T - since java uses it differently - consider | as OR operator
		System.out.println(Arrays.toString(emp1));

		System.out.println("---------------------");
		String userData = "Tom.30.SDET.Pune.India.IBM";
		String emp3[] = userData.split("\\."); // with "." will give AIOB - need to use escape char
		System.out.println(emp3[0]);

		//
		String pop = "I love \"java\" programming"; // \\ escape char is not allowed here need to use '\' as escape char
		System.out.println(pop); // Need to get o/p as - I love "java" programming

		String mop = "I love 'java' programming";
		System.out.println(mop); // no need to use escape here

		// substring:

		String successMessg = "your order id is 12345";

		System.out.println(successMessg.substring(6));
		System.out.println(successMessg.substring(16));

		System.out.println(successMessg.substring(2, 7)); //7 will be exclusive
		System.out.println(successMessg.substring(successMessg.indexOf("is") + 3, successMessg.length()));
		
		//another way
		System.out.println(successMessg.split(" ")[4]);
		
		//contains:  returns boolean
		String test = "welcome admin";
		System.out.println(test.contains("admin"));
		
		if(test.contains("admin")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		//equals:
		String t1 = "hello selenium";
		String t2 = "hello Selenium";
		System.out.println(t1.equals(t2)); //false
		System.out.println(t1.equalsIgnoreCase(t2));  //true
		
		
		// *************for tomorrow 
		// == vs .equals
		// SCP - string constant pool - part of heap memory
		// String, StringBuilder, StringBuffer
		// immutable
		// reverse a string with the checks
		
	}
}
