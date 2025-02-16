package AccessModifier1;

public class Employee extends Department{

	@Override
	public void billing() {
		System.out.println("Employee - billing");	
	}
	
	@Override
	public void releaseFeature() {
		System.out.println("dept - release Feature");
	}
	
	@Override
	public void newsLetter() {
		System.out.println("dept - release Feature");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
