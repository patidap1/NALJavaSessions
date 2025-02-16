package StringConcept;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//'Stringbuilder' while doing heavy string manipulations, this is not thread safe 
		
		StringBuilder sb = new StringBuilder("hello");  //heap-1, scp-1
		sb.append("automation"); //new entry will not be created here
		System.out.println(sb); //helloautomation [mutable- new value of sb will be helloselenium]
		
		//"StringBuffer - for multi threaded applications, this is thread safe
		
		StringBuffer sbf = new StringBuffer("hi");
		sbf.append("cypress");
		System.out.println(sbf); //Mutable - hicypress
		
		String s = "bye";
		s.concat("testing");
		System.out.println(s); //Immutable
	
		
	}

}
