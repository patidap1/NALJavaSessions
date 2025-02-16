package ExceptionHandling;

public class Browser {
	
	String name;
	
	//RT - Runtime Exception : AE, NPE, AIOB
	//RT Exception: unchecked exception 

	public void open() {
		
		System.out.println("Start");
		
		try {
			int ar[] = new int[2]; //0-1
			ar[3] = 10; //AIOB
			
			int i = 9/0; //AE
			Browser obj = new Browser();
			obj = null;
			System.out.println(obj.name); //NPE
		}
		// not allowed since below catch blocks won't be accessible
		/*
		 * catch (Exception e) { System.out.println("Some exception is coming");
		 * e.printStackTrace(); }
		 */
		
		//child 
		catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("NPE is coming");
			e.printStackTrace();
		}
		catch (RuntimeException e) {
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
		
		//parent
		catch (Exception e) { //ChildException --> Exception --> Throwable --> Object (not allowed)
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
		
		catch (Throwable e) { 
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
		
		System.out.println("End");
		
	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.open();
		

 
	}

}
