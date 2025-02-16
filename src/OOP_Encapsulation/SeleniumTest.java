package OOP_Encapsulation;

public class SeleniumTest {

	public static void main(String[] args) {
		// Selenium s1 = new Selenium(); //not allowed since constructor is private
		
		Selenium.getUrl();
		Selenium.click();
		Selenium.quit();
	}

}
