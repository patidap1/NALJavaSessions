package SuperKeywordConstructor;

public class Car {

	String name;
	int price;
	
	//Default parent constructor will be called first
	
	public Car() {
		System.out.println("Car - default constructor");
	}
	
	public Car(String name, int price) {
		System.out.println("Car - two params Const...");
		this.name = name;
		this.price = price;
	}
}

