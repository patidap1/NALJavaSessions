package JavaSessions;

public class WideningAndNarrowingTypeCasting {

	public static void main(String[] args) {
		
		//-128 to 127 => byte can store 256 values
		byte b1 = 40;
		byte b2 = 50;
		// byte b3 = b1+b2; //error 
		// short b3 = b1+b2; //error 
		
		int b3 = b1+b2;
		System.out.println(b3);
		
		
		
		
	}

}
