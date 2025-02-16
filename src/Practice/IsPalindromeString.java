package Practice;

public class IsPalindromeString {

	// The method checks if a given string is a palindrome.
	// A palindrome is a word, phrase, or sequence that reads the same backward as
	// forward
	// (e.g., "radar", "level").

	public static boolean checkPalindromeString(String input) {

		input = input.toLowerCase();

		if (input == null || input.isEmpty()) {
			return false;
		}

		int length = input.length();

		// The loop iterates from the first character (i = 0) to the middle of the
		// string (i < length / 2).
		// Only half of the string is checked because if the first half matches the
		// reversed
		// second half, the entire string is a Palindrome.

		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindromeString("hello"));
		System.out.println(checkPalindromeString("naman"));

	}

}
