package Practice;

public class StrReverse {

	public static void main(String[] args) {
//		System.out.println(reversedString("selenium"));
//		System.out.println(reversedString("null"));
//		// System.out.println(reversedString(null));
//		
//		System.out.println(isPelindrome("selenium"));
//		System.out.println(isPelindrome("null"));
//	//	System.out.println(isPelindrome(null));
//		System.out.println(isPelindrome("1"));
		System.out.println(isPelindrome("ameta"));


		
		
	}

	public static StringBuilder reversedString(String input) {
		
		if(input == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}
		
		if (input.length() == 1 | input.length() == 0) { 
			return new StringBuilder(input);
		}
		
		StringBuilder rev = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev.append(input.charAt(i));
		}
		return rev;
	}
	public static boolean isPelindrome(String input) {
		
		if(input == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}
		
		if (input.length() == 1 | input.length() == 0) { 
			return false; 
		} else {
			StringBuilder rev = new StringBuilder();
			for (int i = input.length() - 1; i >= 0; i--) {
				rev = rev.append(input.charAt(i));
			}
			String reversed = rev.toString().toLowerCase(); 
			if(input.equals(reversed)) {
				return true;
			} else {
				return false;
			}
		}
	}
}