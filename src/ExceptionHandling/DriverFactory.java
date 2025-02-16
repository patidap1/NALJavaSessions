package ExceptionHandling;

public class DriverFactory {
	
	// throws vs throw
	// throws --> to pass the exception from one method to it's caller method
	// throw --> to throw your own exception 

	public static void launchBrowser(String browserName) {

		System.out.println("launching browser: " + browserName);

		switch (browserName.trim().toLowerCase()) {

		case "chrome":
			System.out.println("launch chrome browser");
			break;

		case "firefox":
			System.out.println("launch firefox browser");
			break;

		case "edge":
			System.out.println("launch edge browser");
			break;

		default:
			System.out.println("please pass the right browser");
			throw new BrowserException("Invalid Browser");
			// break; //unreachable code 
		}

	}

	public static void main(String[] args) {
		DriverFactory.launchBrowser("opera");
		System.out.println("entering the url.....https://google.com");
	}

}
