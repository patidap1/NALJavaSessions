package OOP_Inheritance;

public class Car extends Vehicle {

	int speed = 100;
	
	public void start() {
		System.out.println("Car - Start");
	}
	
	public void stop() {	
		System.out.println("Car - stop");
	}
	public void refuel() {
	System.out.println("Car - refuel");
	}
	//final method can not be overridden
	public final void increaseSpeed() {  //add final keyword to avoid overriding 
		
		System.out.println("Car - increaseSpeed");
	}
	//static method can not be overridden
	public static void billing() {  //add final keyword to avoid overriding 
		
		System.out.println("Car - billing");
	}
	//private method - can not be overridden
	private void getCarInfo() {
		
		System.out.println("Car - info");
	}
	
	public void getInfo() {
		getCarInfo();
	}
}
