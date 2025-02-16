package ExceptionHandling;

public class DataException extends RuntimeException{

	//will create a class and extend the java - RuntimeException class by creating a public Constructor
	
	public DataException(String mesg) {
		super(mesg);
	}
}
