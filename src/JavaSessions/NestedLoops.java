package JavaSessions;

public class NestedLoops {

	public static void main(String[] args) {

		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {

				System.out.print(i + "" + j + " "); // 00 01 02 03 04 05
			}
			System.out.println(); // to generate a new line
		}

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {

				for (int k = 0; k <= 5; k++) {

					System.out.print(i + "" + j + "" + k + " "); // 00 01 02 03 04 05
				}

				System.out.println(); // to generate a new line
			}

		}

	}
}
