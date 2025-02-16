package JavaSessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		System.out.println("Hello World");

		// data types : strict type: data type is mandatory	- java is compile time language	
		// 1. primitive data type - no object creation and memory size is already fixed	
		// 1.a: numeric data
			// 1.a.1 Integral value:
				//i: Integer: byte, short, int, long
				//ii: Floating Point: float, double
			// 1.a.2: character: a,b, A, 0, $, &
		
		// 1.b: boolean: true/false 		
		// 2. Non primitive data types - Objects, class, Interface, Arrays ArrayList
		
	//1. byte: 
		// size = 1 byte = 8 bits
		// range = -128 to 127 = 2^7 to 2^7-1
		byte b = 10;
		byte b1 = -90;
		byte b2 = 127;
		byte b3 = 0;
		byte n = 25;
		n = 35; 
		System.out.println(n);
		System.out.println(b); 
		// shortcut - type syso, then press ctrl+space		
		
	// 2. short
		// size: 2 bytes 2x8 = 16 bits
		// range: -32768 to 32767 = = 2^15 to 2^15-1
		short sh = 1000;
		short sh1 = 28989; 
		
	//3. int:
		// size: 4 byte = 4x8 = 32 bits 
		// range: -2147483648 to 2147483647 = 2^31 to 2^31-1
		int i = 10;
		int total = 677656;
		// follow camel casing while creating variable in Java
		int finalBillAmount = 9090900;
		
	//4. long:
		// size: 8 bytes = 8x8 = 64 bits
		// range = 2^63 to 2^63-1
		long lg = 989898; 
		long lh = 989889899998l;  // L - will tell compiler this is a long number
		System.out.println(lh);
		
		// use cases: 
			// world population 
			// distance between planets
			// total no. of corona cases
			// total number of hair
		//XXX  CC, mobile, SN, Aadhar Card: String 
		//XXX 12125454546565655: string
		
	//5. float:
		// size = 4 byte = 32 bits (same as int)
		// range = after . , you can take upto 6-7 digits
		float m = 12.33f; 
		float m1 = (float)44.22; 
		float m3 = 90f;
				
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m3);
		
	//6. double
		// size = 8 bytes = 64 bits
		// range = after . , you can take upto 15 digits
		double t1 = 12.333;
		double t2 = 0.999999;
		double t3 = 100; 
		System.out.println(t3);
		
	//7. char:
		// single digit value
		// size = 2 bytes = 16 bits
		// unicode : ASCII
		char ch = 'a'; //a-z
		char ch1 = 'A'; //A-Z
		char ch2 = '9'; //0-9
		char ch3 = '$'; //special char
		
		char gender = 'm';
		char test = ' ';
		
		// 7. boolean:
		// range : true/false
		// size : ~1 bit
		
		boolean flag = true;
		boolean nv = false;
		
		System.out.println(flag);
		System.out.println(nv);
		
		System.out.println(10>5);
		System.out.println(100);
		System.out.println(12.33F);
		
		//string: class: non primitive 
		
	}

}
