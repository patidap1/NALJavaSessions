package StaticConcept;

public class FinalKeyword {
	
	static final String name = "pawan"; // has to be initialized if declared as static

	public static void main(String[] args) {
		final int days = 7;  //local variable - static is only for class variable not local ones
		// days = 10;  //The final local variable days cannot be assigned. It must be blank and not using a compound assignment
		
		int salary = 100*days;
		System.out.println(salary);
		
		

	}

}
