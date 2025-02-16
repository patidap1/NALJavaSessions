package StringConcept;

public class StringReverse {

	public static StringBuilder reverse(String str) {
		// selenium

		if(str == null) { //null check
			throw new RuntimeException("String can not be null...");
		}
		
		if (str.length() == 1 | str.length() == 0) {  //length check
			//&& = AND, | OR operator
			return new StringBuilder(str);
		}

		int len = str.length(); //8
		StringBuilder rev = new StringBuilder();  // user StringBuilder since we do heavy manipulation here
		// String rev = "";
		
		for (int i = len - 1; i >= 0; i--) {
			// rev = rev + str.charAt(i);
			rev = rev.append(str.charAt(i));
		}
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(reverse("selenium")); //time complexity - O(n)  - worst case
		System.out.println(reverse("testing"));
		System.out.println(reverse("A")); //O(1) - best case
		System.out.println(reverse("")); //O(1) - best case
		
		System.out.println(reverse("-------------"));
		System.out.println(reverse(" "));
		System.out.println(reverse("-------------"));
		System.out.println(reverse("123"));
		System.out.println(reverse("1100"));
		System.out.println(reverse("null"));
		
		System.out.println(reverse(null));
		
		
		// String s = "selenium"; //s.reverse() is not available since it is immutable
		// StringBuilder sb = new StringBuilder(s);
		// System.out.println(sb.reverse()); //since StringBuilder is mutable -reverse()
		// function is available
	}

}
