package Functions;

public class Browser {
	
	// cross browser logic
	// function name: launchBrowser
	// params : String broserName
	// return : boolean: true/false
	
	public boolean launchBrowser(String browserName) {
		System.out.println("checking the browser..." + browserName);
		if(browserName.equals("chrome")) {
			System.out.println("Chrome is launched");
			return true;
		}
		else if(browserName.equals("firefox")) {
			System.out.println("firefox is launched");
			return true;
		}
		else if(browserName.equals("edge")) {
			System.out.println("Edge is launched");
			return true;
		}
		else {
			System.out.println("Please pass the right browser..." + browserName);
			return false;
		}
		
	}

	public static void main(String[] args) {
		Browser br = new Browser();
		boolean status = br.launchBrowser("opera");
		System.out.println(status);
		if(status) {
			System.out.println("enter the url");
		}
		else {
			System.out.println("dont enter the url");
			
		}
			

	}

}
