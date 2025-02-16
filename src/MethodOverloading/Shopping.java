package MethodOverloading;

import java.util.Arrays;

public class Shopping {
	
	// product requirement : User Story - Acceptance Criteria
	public void login() {
		
	}
	
	public void login(String username, String password) {
		System.out.println(username + " : " + password);
	}
	
	public void login(String username, String password, int otp) {	
	}

	public void login(String socialMedia) {	
	}
	
	//search
	public void search() {
		System.out.println("top 10 listed products for today");
	}
	
	public int search(String productName) {
		System.out.println("Search prodcut " + productName);
		return 100;
	}
	
	public int search(String productName, int price) {
		System.out.println("Search prodcut " + productName + " " + price);
		return 100;
	}
	
	public int search(String productName, int price, String color) {
		System.out.println("Search product " + productName + " Price: " + price + " Color: " + color);
		return 40;
	}
	
	//Add to cart
	public void addToCart(String productName) {
		System.out.println("Adding to Cart " + productName);
	}
	
	//make the payment: US : AC:1, cc/cvv 2. UPI, 3: un/pwd/otp
	public void payment(String cc, int cvv, String cardType) {   // use String for the numbers line Adhaar, Credit card no.. etc.. where no calcualation needs to be done
		// System.out.println("Making the payment using:  " + cc + " : " + cvv + "Card Type: " + cardType);
		switch(cardType) {
		case "visa":
			System.out.println("Making the payment using:  " + cc + " : " + cvv + " Card Type: " + cardType);
			break;
		case "mastercard":
			System.out.println("Making the payment using:  " + cc + " : " + cvv + " Card Type: " + cardType);
			break;
		default:
			System.out.println("this card is not supported..paymetn is failed..please use only visa/mastercard");
			break;
		}
	}
	
	public void payment(String upi) {
		
	}
	
	public void payment(String un, String pwd, int otp) {
		
	}
	
	public int generateOrder() {
		System.out.println("Order is successfully placed..");
		System.out.println("sending order to the mail");
		return 87894;
		
	}
	
	public Object[] sendMailToCustomer() {
		
		System.out.println("sending order to email");
		Object orderDetails[] = {8787, "macbook pro", "sun tech, noida", "silver", 2050};
		return orderDetails;
	}
	
	public void logout() {
		
		System.out.println("logout....bye!!");
	}
	
	//uber:
	public void booking(String stPoint, String endPoint) {	
	}
	
	public void booking(String stpoint, String endPoint, String carType) {	
	}
	
    public void booking(String stpoint, String endPoint, String carType, int userCount) {	
	}
	
	//banking app
    //createAccount
    //getLoan()
    
    //selenium
    
    public void click() {
    	
    }
    
    public void click(String element) {
    	
    }
    
    public void click(String element, int timeOut) {
    	
    }
    
    public void waitForElement(String element, int timeOut, int pollingTime) {
    	
    }
    
   	
	public static void main(String[] args) {
	
		Shopping shop = new Shopping();
		// shop.login();
		shop.login("naveen@gmail.com", "test123");
		// shop.login("ravi@gmail.com", "test@123", 1234);
		
		int resultCount = shop.search("macbook pro", 2000, "silver");
		System.out.println(resultCount);
		
		shop.addToCart("macbook pro");
		
		shop.payment("9090 8787 8989 8989", 123, "mastercard");
		
		int orderId = shop.generateOrder();
		System.out.println("Order id : " + orderId);
		
		Object myDetails[] = shop.sendMailToCustomer();
		System.out.println(Arrays.toString(myDetails));
		
		shop.logout();
		System.out.println("logged out successfully..");
	}

}
