package OOP_Inheritance;

public class BMW extends Car {
	
	int speed = 200;

	//Method Overriding: Poly+Morphhism : Dynamic(Runtime)
	//When we have a method in parent class and same method in child class with:
	//1. with the same name
	//2. with the same number of parameters
	//3. With the same Return type  
	
	//Car - super class or parent class
	
	@Override   //java feature
	public void start() {	
		System.out.println("BMW - Start");
	}
	
	@Override 
	public void engine() {
		System.out.println("BMW - Engine");
		
	}
	// @Override  // will give error since this is not overriden
	public void autoPark() {
		System.out.println("BMW - Autopark");
		
	}
	
	// @Override  / final method can not be overridden 
	// public final void increaseSpeed() {
		
		// System.out.println("Car - increaseSpeed");
	// }
	
	//This is not overridden 
	//method hiding
	//individual static method
	public static void billing() {
		
		System.out.println("BMW - billing");
	}
	
	//individual method
	private static void getCarInfo() {
		
		System.out.println("BMW - billing");
	}
	
}
