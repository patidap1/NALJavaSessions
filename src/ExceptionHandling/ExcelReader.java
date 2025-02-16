package ExceptionHandling;

public class ExcelReader {

	public static void main(String[] args) {
		
		String data = null;
		
		if(data == null) {
			throw new DataException("Invalid Data");
		}
		
		System.out.println("Bye!!");

	}

}
