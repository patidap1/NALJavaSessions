package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("LaunchBrowser");
		checkBrowserExist();
		checkBrowserVersion();
		checkBrowserCompatible();
		checkBrowserUpdates();
		
		System.out.println("browser is launched");
		
	}
	private void checkBrowserExist() {
		System.out.println("CheckBrowserExist");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	private void checkBrowserCompatible() {
		System.out.println("checkBrowserCompatible");
	}

	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates");
	}

}
