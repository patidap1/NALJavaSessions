package SuperKeyword;

public class Car extends Vehicle {

 	int speed = 100;
	
	public void start() {
		super.start();
		System.out.println("Car - start");
	}
	
	public void stop() {
		System.out.println("Car - stop");
	}
	
	public static void billing() {
		System.out.println("Car = billing");
	}
	
	public void displayVehicleSpeed() {
		System.out.println(super.speed);
		
	}
}
