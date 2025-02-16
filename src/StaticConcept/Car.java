package StaticConcept;

public class Car {

	String name;  // unique value
	int price;  // unique
	String model;  // unique
	// int wheels;  // common value
	// static int wheels = 4; // objects will never hold the static property
	// will store in parmanent generation >> after jdk 1.8 -> it was renamed to Metaspace
	// it is also called CMA: Common memory allocation 
	
	// final keyword 
	static final int wheels = 4;
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.model = "x3";
		// c1.wheels = 4;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.model = "q3";
		// c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.model = "City";
		// c3.wheels = 4;
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + Car.wheels);
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + Car.wheels);
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + Car.wheels);
		
		//access static variables: 
		//1. using the class name:
		
		System.out.println(Car.wheels);
		// System.out.println(Car.name); // only static properties can be accessed
	
		//2. Can access directly within the class:
		System.out.println(wheels);
		// To avoid the confusion - better to user classname.staticvariable 
		
		//3. Can access static var using the object reference name 
		System.out.println(c1.wheels); //warning: The static field Car.wheels should be accessed in a static way
		// should not use static var using the object reference 
		// every object have indirect reference to the static var
		
		// Car.wheels =5;  //value will be updated - common value, if final keyword is added while declaring 
		// it will give error if try to update the value
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + Car.wheels);
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + Car.wheels);
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + Car.wheels);
			
		
	}

}
