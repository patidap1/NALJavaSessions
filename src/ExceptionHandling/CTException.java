package ExceptionHandling;

import java.io.File;

public class CTException {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		try {
			Thread.sleep(5000);  //CT / Compile Time:  Checked exception
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		System.out.println("Bye");
		
		File file = new File("test.pdf");
		
	}

}
