package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "edge":
			System.out.println("Launch Edge");
			break;
		case "ie":
			System.out.println("Launch IE");
			break;

		default:
			System.out.println("plz pass the right browser.." + browser);
			break;
		}
	
	//byte, short, int
//	int num = 90;
//	switch (num) {
//	case 1:
//		break;
//	
//	default:
//	break;
//	}
//	
//	//long, double, float, boolean: NA
//	float num1 = 10.12f;
//	switch (num1)) {
//	case 1: {
//		
//		break;
//	}
//	default:
//		break;
//	}
	
	//use cases:
	//1. cross browser logic
	//2. User role: RBAC (Role based access) : admin, seller, partner, vendor, customer
	//3. Environment: dev, QA, uat, prod
	//4. payment: CC, UPI, paypal, Stripe
	//5. Language:
	//6. Loan type:
	//7. Uber car type: sedan, mini, premium
	//8. OS logic - mac, lin

// WAP to book the specific type of car from the Uber app using Switch - Case. 
//Car Type: Mini, Sedan, SUV, Premium
// If user passes wrong car type, print please select the right car type
	
	String cartype = "Mini";
	switch (cartype) {
	case "Mini":
		System.out.println("Selected Car Type is " + cartype);
		break;
	case "Sedan":
		System.out.println("Selected Car Type is " + cartype);
		break;
	case "SUV":
		System.out.println("Selected Car Type is " + cartype);
		break;
	case "Premium":
		System.out.println("Selected Car Type is " + cartype);
		break;
	default:
		System.out.println("Please select correct car type.." + cartype);
		break;
	
		
	}
	
	}
	
}
