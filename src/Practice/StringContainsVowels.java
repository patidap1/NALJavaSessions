package Practice;

public class StringContainsVowels {

	public static boolean StringContainsVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	public static void main(String[] args) {
		System.out.println(StringContainsVowels("hello"));
		System.out.println(StringContainsVowels("swswswswsw"));
	}

}
