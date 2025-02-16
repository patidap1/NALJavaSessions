package JavaSessions;

public class MatheOperations {

	public static void main(String[] args) {

		int a = 10;
		System.out.println(a/2);
		System.out.println(9/2); //4
		
		System.out.println(9.0/2); //4.5
		System.out.println(9.0/2.0); //4.5
		System.out.println(9/2.0); //4.5
		
		System.out.println(9); //by default it takes as integer
		System.out.println(0.9); // be default float
		
		// System.out.println(9/0); //AE - ArithmeticException 
		System.out.println(0/9);  //0
		System.out.println(9/0.0); //Infinity - any value is decimal then gives Infinity
		System.out.println(9.0/0); //Infinity
		System.out.println(9.0/0.0); //Infinity
		System.out.println(0.0/0.0); //NaN - Not a Number 
		System.out.println(0/0.0); //NaN
		System.out.println(0.0/0); //NaN
		// System.out.println(0/0); //AE - ArithmeticException
		
		System.out.println(9.0f/0); //Infinity
		
		System.out.println(0.1+0.1); // 0.2
		System.out.println(0.1+0.2); // 0.30000000000000004
	}

}
