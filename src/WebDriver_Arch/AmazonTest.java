package WebDriver_Arch;

public class AmazonTest {

	static WebDriver driver;  // created as static - so it will be accessible within the class without creating the object of the class
	
	public static void main(String[] args) {
		
		//Chrome/Firefox/Edge: 
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// EdgeDriver driver = new EdgeDriver();
		
		String browser = "chrome";
		
		switch (browser.trim().toLowerCase()) {
		case "chrome": 
			driver = new ChromeDriver(); //top casting
			break;
		case "firefox": 
			driver = new FirefoxDriver(); //top casting
			break;
		case "edge": 
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Plz pass the right browser.."+ browser);
			break;
		}
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title: "+ title);
		
		driver.findElement("emailId");
		driver.findElement("password");
		driver.findElement("login button");
		
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("login button");
		
		driver.quit();
	}

}
