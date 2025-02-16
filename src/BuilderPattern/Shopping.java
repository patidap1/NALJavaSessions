package BuilderPattern;

public class Shopping {
	
	//this:
		//1. can be used to init the class variables with this.g = in the constructor
		//2. encapsulation: setter: this.g = l
		//3. this() can be used to call the same class constuctor
		//4. in builder pattern: to generate the workflow/user journey: every method will return this keyword
			//only the same object will be returned
			//
	
	public Shopping login() {
		System.out.println("login to app");
		return this;  //returning current class object
	}
	
	public Shopping login(String un, String pwd) {
		System.out.println("login to app using: "+ un + ":" + pwd );
		return this;
	}
	
	public Shopping search() {
		System.out.println("default search");
		return this;
	}

	public Shopping search(String productName) {
		System.out.println("Search with " + productName);
		return this;
	}
	
	public Shopping search(String productName, int price) {
		System.out.println("Search with " + productName + price);
		return this;
		
	}
	
	public Shopping addToCart(String productName) {
		System.out.println("Added to cart " + productName);
		return this;
	}
	
	public Shopping makePayment(String upi) {
		System.out.println("make payment" + upi);
		return this;
	}
	
	public Shopping makePayment(String cc, int cvv) {
		System.out.println("Make payment" + cc + cvv);
		return this;
	}
	
	public Shopping generateOrderId() {
		System.out.println("Generated order id is = "+ 12345);
		return this;
	}
	
	public Shopping logOut() {
		System.out.println("log out");
		return this;
		
	}
}

