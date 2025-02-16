package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
		} 
		
		catch (ArithmeticException e) { 
			System.out.println("AE is coming....."); 
			}
		 
		finally {  //will go to finally block even if exception occurs or not
			System.out.println("I am into finally block");
		}
		System.out.println("bye!!");
	}

}
