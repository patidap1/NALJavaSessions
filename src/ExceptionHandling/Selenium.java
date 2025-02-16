package ExceptionHandling;

public class Selenium {
	
	//amaozn 
	public void search() {
		System.out.println("search method");
		doPayment();
	}
	
	public void doPayment() {
		System.out.println("making the payment method");
		try {
			icicibankServerMethod();
		}
		catch(ArithmeticException e) {
			System.out.println("AE Is coming....bank server is not responding");
			e.printStackTrace();
		}
	}
	
	
	//3rd system: icici bank 
	public void icicibankServerMethod() throws ArithmeticException{
		System.out.println("m3 method");
		int i = 9 / 0;	
	}

	//browser - user
	public static void main(String[] args) {
	
		Selenium obj = new Selenium();
		obj.doPayment();
		System.out.println("bye!!");
	}

}
