package BuilderPattern;

public class AmazonTest {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
		
		//method chaining: builder pattern
		//only one object will be created
		shop.login("admin", "admin123")
				.search("macbook pro")
					.addToCart("macbook pro")
						.makePayment("tele@okicici")
							.generateOrderId()
								.logOut();
		
		//
		shop.login("naveen@gamil.com", "naveen123")
			.search("tshirt", 1000)
				.logOut();
		
		//
		shop.login("naveen@gamil.com", "naveen123")
			.search("keyboard")
				.addToCart("keyboard")
					.logOut();
		
		//
		shop.login("naveen@gamil.com", "naveen123")
			.makePayment("87777@okicici")
				.logOut();
		
		//
		shop.login("naveen@gamil.com", "naveen123")
			.logOut();
		
		//
		shop.login("tom@gamil.com", "tom@123")
			.search("shoes", 500)
				.makePayment("9988 9877 8766 6676", 111)
					.generateOrderId()
						.logOut();
	}

}
