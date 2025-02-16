package JavaSessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		System.out.println(10 < 5);

		// < > >= <= == !=
		int a = 2;
		if (a > 5) {

			System.out.println("hi");
		}

		else {
			System.out.println("bye");
		}

		// nested if -if-if-else
		int marks = 98;
		if (marks >= 90) {
			System.out.println("Grade A");
			if (marks >= 95) {
				System.out.println("Grade A++");
				if (marks == 100) {
					System.out.println("eligible for scholarship");
				} else {
					System.out.println("Bye");
				}
			}
		} else {
			if (marks >= 70) {
				System.out.println("grade B");
			} else {
				System.out.println("Fail");
			}
		}
		
		// if comparing two primitive data types: ==
		// If comparing two non primitive data types (String): .equals
		
		
		//performance issue: will execute each line of code
		/*
		 * String browser = "chrome"; if (browser.equals("chrome")) {
		 * System.out.println("launch chrome"); }
		 * 
		 * if (browser.equals("firefox")) { System.out.println("launch firefox"); } if
		 * (browser.equals("edge")) { System.out.println("launch edge"); } if
		 * (browser.equals("ie")) { System.out.println("launch ie"); } else {
		 * System.out.println(" Plz pass the right browser...." + browser);
		 * 
		 * }
		 */
		
		//performance issue: will check every condition
		//if-elseif-elseif-elseif-else
		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("firefx") ) {
			System.out.println("launch firefox");
		}
		else if (browser.equals("edge")) {
			System.out.println("Launch Edge");
		}
		else if (browser.equals("ie")) {
			System.out.println("Launch IE");
		}
		else {
			System.out.println("Plz pass the right browser...." + browser);
		}

	}

}
