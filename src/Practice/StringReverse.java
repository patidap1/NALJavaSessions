package Practice;

public class StringReverse {
	
//Reverse the input string using char array
	public static String ReversedString(String input) {
		
		if(input == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}
		
		if (input.length() == 1 | input.length() == 0) { 
			return new String (input);
		}
		
		StringBuilder output = new StringBuilder();
		
		char[] chars = input.toCharArray();
		
		for (int i = chars.length -1; i >=0; i--) {
			output.append(chars[i]);
		}
		return output.toString();
			
	}
	
//Reverser the string using StringBuilder class object
	public static StringBuilder reverse(String str) {

			if(str == null) { //null check
				throw new RuntimeException("String can not be null...");
			}
			
			if (str.length() == 1 | str.length() == 0) {  //length check
				//&& = AND, | OR operator
				return new StringBuilder(str);
			}

			int len = str.length(); //8
			StringBuilder rev = new StringBuilder();  // user StringBuilder since we do heavy manipulation here
			
			// The loop iterates:
			// i = 4: Append 'o' → rev = "o"
			// i = 3: Append 'l' → rev = "ol"
			// i = 2: Append 'l' → rev = "oll"
			// i = 1: Append 'e' → rev = "olle"
			// i = 0: Append 'h' → rev = "olleh"
			for (int i = len - 1; i >= 0; i--) {
				rev = rev.append(str.charAt(i));
			}
			return rev;
		}

	public static void main(String[] args) {
		System.out.println(ReversedString("Selenium"));
		System.out.println(reverse("Selenium"));
		

	}

}
