package ExceptionHandling;

public class Customer {

	String name;

	public static void main(String[] args) {

		System.out.println("print the customer information");

		try {
			int i = 9 / 0; //AE - Arithmetic Exception
			Customer obj = new Customer();
			obj = null;
			System.out.println(obj.name); //NPE - Null pointer exception	
		} 
		
	/*	catch(Exception e) {
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}*/
		
		//Using single catch block is a bad practice
		// Always write multiple catch blocks
		
		  catch (ArithmeticException e) { 
			  System.out.println("AE is coming");
			  e.printStackTrace();
		  } catch (NullPointerException e) { 
			  System.out.println("NPE is coming");
			  e.printStackTrace(); 
		  } catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("AIOB is coming");
			  e.printStackTrace();
		  }
		 
		
		
		System.out.println("Bye");
	}

}
