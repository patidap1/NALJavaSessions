package AccessModifier1;

public class Car {

	//Non static Data members: vars + methods
	public String name;
	int price;
	protected String color;
	private String chasisNumber;	
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.chasisNumber = "1234test";
		c.name = "honda";
		c.price = 12;
		c.color = "white";
		
	
		}

}
