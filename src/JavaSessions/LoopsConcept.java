package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		int i = 1; // initialization
		while (i <= 10) {
			System.out.println(i);
			i++;
			// ++i; // result is same as above
			// i = i+1; // same result
		}

		System.out.println("--------------------");
		// 10-1
		int e=10;
		while(e>=1) {
			System.out.println(e);
			e--;
		}
		
		
		System.out.println("-------------------");
		
		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			System.out.println("hi");
			break;
			// System.out.println("hi"); // Unreachable code/dead code
		}
		
		System.out.println("-------------------");

		int t = 1;
		while (t <= 10) {
			System.out.println(t);
			if (t == 5) {
				System.out.println("Bye!!");
				break; // break the loop not just the condition
			}
			t++;
		}
		
		System.out.println("---------------------");
		
		while(true) {
			System.out.println("welcome to hotel Taj");
			break; // without break it will run for infinite time
		}
		
		// For Loop
		System.out.println("---------------------");

		for(int k=1; k<=10; k++) {
			System.out.println(k); //1
			
		}
		
		int h = 1;  // also valid
		for(; h<=10; h++) {
			System.out.println(h); //1
		}
		
		int m = 1;  // also valid
		for(;m<=10;) {
			System.out.println(m); //1
			m++;
		}
		
		System.out.println("---------------------");
		
		for( ; ; ) {  //by default it will take it as 'true'		
			System.out.println("Welcome to Naveen Automation Labs");  //will print for infinite times
			break;
		}
			
		System.out.println("---------------------");
		
		for(byte b=1; b<=10; b++) {  // will work for byte, long, short also
			System.out.println(b);	
		}
		
		System.out.println("---------------------");
		
		for(double d=1.0; d<=5.5; d++) {  //incremental in decimal d=d+0.1
			System.out.println(d);	
		}
				
		System.out.println("---------------------");
		
		for(float f=1.0f; f<=5.5; f++) {
			System.out.println(f);
		}
		
		System.out.println("---------------------");
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch + " = " + (int)ch);
		}
	
		//97 = a
		for(int dt=97; dt<=122; dt++) {
			System.out.println((char)dt + " = " + dt);
		}
		System.out.println("-------------------------");
		// 10 to 1
		for(int l=10; l>=1; l--) {
			System.out.println(l);	
		}
		// string reverse > "selenium" --> "muineles"
		
		System.out.println("--------------------------------");
		
		// use cases:
				// while loop: when number of iterations are not fixed
				// 1. facebook/linkedin/insta: infinite scrolling
				// 2. webtable pagination: < 1 2 3 4 ...n>
				// 3. waiting for the web element: 5 10 2 0
				// 4. waiting for the page loading: 5 10 15 20 40
				// 5. calendar handling
				// 6. retry for the failure test cases

				// for loop: when number of iterations are fixed
				// arrays, arraylist: [10] : 1 to 10
				// dropdown: country(233): static
				// month: 1 to 12:
				// redbus.in: 230 seats: 1 to 230
				// google search
		
		
		// do-while
		int p=1;
		do {
			p++; //2-11
			System.out.println(p);
			// p++;//12345678910
		}
		while(p<=10); //T
		
		// use cases
//		do {
			// check the web element already present on the page (Button/Link)
			// Click on it
		//Break
//	}
//	while(Condition)
//		}
// Exercise 1 - Find greatest from 4 numbers	
		int a = 25;
		int b = 78;
		int c = 87;
		int d = 97;

		if (a > b && a > c && a > d) {
			System.out.println("a is greatest");
		} else if (b > a && b > c && b > d) {
			System.out.println("b is greatest");
		} else if (c > a && c > b && c > d) {
			System.out.println("c is greatest");
		} else {
			System.out.println("d is greatest");
		}
		
// Excercise 2: Write a Java program to test a number is positive or negative.
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number
		
		int number = 1;
		
		if(number > 0) {
			System.out.println("Number is positive");
		}
		else if(number < 0) {
			System.out.println("Number is negative");
		}
		else{
			System.out.println("Number is zero");
		}
		
		
// WAP to check number is odd or even using If - Else
		int num1 = 5;
		if (num1 % 2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
// Print I am BATMAN for 5 time
		for(int ii = 1; ii<=5; ii++) {
			System.out.println("I am BATMAN");
		}
		for(int jj = 1; jj<=9; jj++) {
			System.out.println("I am BATMAN " + jj );
		}
		
		for(int kk = 10; kk>=1; kk--) {
			System.out.println(kk);
		}
		
		
		int q=10;
		do {
			System.out.println(q);
			q--;
		}
		while(q>=1); //T
		
		int r = 1;
		do {
			System.out.println("Hello World");
			r++;
		}
		while(r<=10);
		
		int numberx = 1;
		while(numberx<=100) {
			if(numberx % 5 == 0) {
				System.out.println(numberx);
			}
			numberx++;
		
		}
			
		
		int num2 = 1;
		while (num2 <= 10) {
			System.out.println(num2);
			if (num2%7 == 0) {
				System.out.println("Bye, see you tomorrow!!");
				break; // break the loop not just the condition
			}
			num2++;
		}
		
		
	}

}
