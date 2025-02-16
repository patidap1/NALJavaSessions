package PropertiesConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {

	public static final String CONFIG_FILE_PATH = "./src/PropertiesConcept/config.properties";
	
	// add './' at beginning of relative path to avoid nullPointerException

	public static void main(String[] args) {
		Properties prop = null;
		
		try {
			FileInputStream ip = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			prop.load(ip);
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//properties are case sensitive
		String browserName = prop.getProperty("browser");
		System.out.println("Browser name is: " + browserName);
		
		switch (browserName.trim().toLowerCase()) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch chrome");
			break;
		default:
			throw new RuntimeException("Invalid browser.....");
			/// break;
		}
		
		String appUrl = prop.getProperty("url");
		System.out.println("app Url : " + appUrl);
		
		
		//use cases:
		//1. To maintain configuration data/environment data
		//2. To maintain application environment specific data: dev/qa/staged/uat/prod
		//3. never use prop files for test data/locators
		
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("header")); //if property is not available it will return null
		System.out.println(prop.getProperty("url"));
		
	}

}
