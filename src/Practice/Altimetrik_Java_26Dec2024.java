package Practice;

public class Altimetrik_Java_26Dec2024 {

	 public static void main(String[] args) {
	        // Input strings
	        String input1 = "Vaibhav";
	        String input2 = "Bananas";

	        // Resultant output
	        String output = interleaveStrings(input1, input2);

	        // Display the result
	        System.out.println("Output: " + output);
	    }

	    public static String interleaveStrings(String str1, String str2) {
	        StringBuilder result = new StringBuilder();
	        int length1 = str1.length();
	        int length2 = str2.length();
	        int maxLength = Math.max(length1, length2);

	        // Interleave characters from both strings
	        for (int i = 0; i < maxLength; i++) {
	            if (i < length1) {
	                result.append(str1.charAt(i));
	            }
	            if (i < length2) {
	                result.append(str2.charAt(i));
	            }
	        }

	        return result.toString();
	    }
	}