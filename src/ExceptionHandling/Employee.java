package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0; // whenever exception is coming program will be terminated there itself
			System.out.println("hello world");  //won't get executed
		}

		catch (ArithmeticException e) {
			// reporting part
			System.out.println("AE is coming....");
			e.printStackTrace();
		}

		System.out.println("hello world"); 
		
		System.out.println("Bye!!");
		
		try {
			int p = 9/0;
			} catch(ArithmeticException f) {
			f.printStackTrace();
		}
		System.out.println("Bye World");
		
	}

}
