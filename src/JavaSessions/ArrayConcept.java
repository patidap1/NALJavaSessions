package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
        // Array = non primitive data type
		// it will hold only similar types of data
		
		// Two types of declarations 
		//1. New keyword
		//2. Array literals
		
		// Limitations of array:
		//1. Size is fixed: static Array - to overcome this we have to use: ArrayList(Collections)
		//2. Stores only similar data types:
		
		int i[] = new int[4];  //0-3
		// i[-1] = 5; // AIOB
		i[0] = 10;  // lowest index
		i[1] = 20;
		i[2] = 30;
		i[3] = 40; // highest index
		// i[4] = 50; //AIOB
		
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
	//	System.out.println(i[4]); // array out of bounds (AIOB) 
	//  System.out.println(i[-1]); // AIOB
		
		System.out.println("Li = " + 0);
		int len = i.length;
		System.out.println("Length = " + len);
		System.out.println("Hi = " + (len-1));
		
		System.out.println("-----------------------------");
		
		int j[] = new int[5];
		j[1] = 100;
		System.out.println(j[0]); // int will hold value as 'zero' by default
		System.out.println(j[1]);
		System.out.println(j[2]); //
		System.out.println(j[3]); // default value for int will be zero
		
		System.out.println("Li = " + 0);
		int len1 = j.length;
		System.out.println("Length = " + len1);
		System.out.println("Hi = " + (len1-1));
		
		// size [0] - segments = 0
		// -1 = NegativeArraySizeException 
		System.out.println("-----------------------------");
		
		byte b[] = new byte[3]; //0-2
		b[0] = 10;
		b[1] = 30;
		
		System.out.println("-----------------------------");
		
		float fl[] = new float[5];
		fl[0] = 12.33f;
		System.out.println(fl[0]);
		System.out.println(fl[1]); // default value for float and double will be 0.0
		
		System.out.println("-----------------------------");
		
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '1';
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);  // default value of a char is 'space'
		
		boolean flag[] = new boolean[2]; //0-1
		flag[0] = true;
		System.out.println(flag[0]);
		System.out.println(flag[1]); // default value of boolean will be false
		
		//default values
		// integer = 0
		// double/float = 0.0
		// char = space
		// boolean = false
		
		
	}

}
