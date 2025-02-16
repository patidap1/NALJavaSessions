package ExceptionHandling;

public class ErrorHandling {
	
	public static void m1() {
		System.out.println("m1 method");
		try {
		m2();
		}
		catch (Error e) {
			System.out.println("Stack is full....");
			// e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception is coming....");
			// e.printStackTrace();
		}
	}
	
	public static void m2() {
		System.out.println("m2 method");
		m1();
	}
	

	public static void main(String[] args) {
		// Error (system) vs Exception (code) ---> Child of Throwable 
		// Error is also an unchecked exception
		
		ErrorHandling.m1();
		
		System.out.println("hi");
		
		try {
			System.out.println("some logic");
			//exception
			//error
		}
		catch(Error e) {
			System.out.println("Some error is coming");
			e.printStackTrace();
		}
		
		catch(Throwable e) {
			System.out.println("Some error or exception is coming");
			e.printStackTrace();
		}
	}

}
