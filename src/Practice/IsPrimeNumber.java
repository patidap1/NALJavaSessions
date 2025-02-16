package Practice;

public class IsPrimeNumber {

	// Divide the given number 'num', by a number from 2 to num/2 and check the remainder. 
	// If the remainder is 0, then it’s not a prime number
	
	public static boolean isPrimeNumber(int num) {
		if (num == 0 | num == 1 ) {
			return false; 
		}
		if (num == 2) {
			return true;
		}
		for (int i = 2; i <= num / 2; i++) {
			if(num % i == 0 ) {
				return false; 
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(7));

	}

}
