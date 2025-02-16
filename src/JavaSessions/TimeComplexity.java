package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// TC - Time Complexity
		// Big Oh
		// O(n)

		int i = 10;
		System.out.println(i); // 10
		int j = 20;
		// O(1) : Constant Time

		for (int k = 0; k <= 10; k++) {
			System.out.println(k);
		}

		// 1+n+n+n => 3n+1 linear equation
		// 3n+1 ==> 3n ==> n ==> )(n)


	int r = 1;
	while(r<=10) {
		System.out.println(r);
		System.out.println("Bye!!");
	}

	// 1+n+n+n+n => 4n+1 ==> n ==> O(n)

//	for (int i = 0; i <= 5; i++) {
//
//		for (int j = 0; j <= 5; j++) {
//
//			System.out.print(i + "" + j + " "); 
//		}
//		System.out.println(); // to generate a new line
//	}

	// (1+n+n+n)(1+n+n+n) => (1+3n)(1+3n) => 1+3n+3n+9n^2 (Quadratic Equation)
	// 9n^2+6n+1 ==> 9n^2+6n ==>

//	for (int i = 0; i <= 5; i++) {
//
//		for (int j = 0; j <= 5; j++) {
//
//			for (int k = 0; k <= 5; k++) {
//
//				System.out.print(i + "" + j + " " + k + ""); // 00 01 02 03 04 05
//			}
//
//			System.out.println(); // to generate a new line
//		}
//
//	}

	// ()()() Cubic equation (n) (n) (n) --> O(n^3)
	}
}
