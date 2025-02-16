package Practice;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "ie";

		switch (browser.trim().toLowerCase()) {

		case ("chrome"):
			System.out.println("launching chromer browser");
			break;
		case ("ie"):
			System.out.println("launching IE Browser");
			break;
		case ("safari"):
			System.out.println("launching safari");
			break;
		default:
			System.out.println("please pass the correct browser");
			break;
		}
	}
}
