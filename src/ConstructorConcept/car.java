package ConstructorConcept;

public class car {
	
	String name;
	int price;
	String model;
	String licenseNumber;

	public car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public car(String name, String model, String licenseNumber) {
		this.name = name;
		this.model = model;
		this.licenseNumber = licenseNumber;
	}
	
	public car(String name, int price, String model, String licenseNumber) {
		this.name = name;
		this.price = price;
		this.model = model;
		this.licenseNumber = licenseNumber;
	}

	public void start() {
		
	}

	public static void main(String[] args) {

		//CRUD = Create Read update delete
		car c1 = new car("Honda", 45); //Create POST 
		car c2 = new car("BMW", "X6", "sdawda");
		car c3 = new car("Audi", 500000, "A3", "234235rdsfsd");
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber ); //read - GET
		c1.licenseNumber = "1243523stret"; //update - PUT/PATCH
		c1.model = "civic"; //update PUT/PATCH
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.licenseNumber ); //read - GET
		
		System.out.println("-------------------------------------");
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.licenseNumber );
		c2.price = 6000;
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.licenseNumber );
		
		System.out.println("-------------------------------------");
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.licenseNumber );
		c3.price = 42400;
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.licenseNumber );	
		
	}

}
