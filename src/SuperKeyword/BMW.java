package SuperKeyword;

public class BMW extends Car{
	
	int speed = 200;
	
	@Override
	public void start() {
		
		// use super keyword to access the properties from Parent class
		super.start(); //Car start
		System.out.println("BMW - start");
	}
	
	public void displaySpeed() {
		System.out.println(super.speed); //100
		System.out.println(speed); //200
		displayVehicleSpeed();
	}
	
	//method hiding
	public static void billing() {
		Car.billing(); // dont use super for static methods and variables - direct access with class name.
		System.out.println("BMW - billing");
	}

}
