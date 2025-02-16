package StringConcept;

public class CharSequenceConcept {

	public static void main(String[] args) {

		//CharSequence - I
		//String, StringBuilder, StringBuffer - class implements CharSequence
		
		String name = "deb";
		StringBuilder sb = new StringBuilder("testing");
		StringBuffer sbf = new StringBuffer("selenium");
		
		System.out.println(sb.reverse());
		System.out.println(sbf.reverse());
		
		sendKeys(sbf);
		
		System.gc(); //whenever needed call the garbage collector
	}

	private static void sendKeys(CharSequence value) {
		System.out.println(value);
		
	}

}
