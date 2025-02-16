package MethodOverloading;

public class MainMethodOverloading {
	
	// main() method can be overloaded
	// psvm: String[] --- JVM will go to this one so will go to line 7
	// do we really overload main method : NO (why to overload the caller method
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "Naveen");
		
		
	}

	public static void main(int a) {
		System.out.println("Hello World " + a);
	}
	
	public static void main(int a, String b) {
		System.out.println("Hello World " + (a+b));
	}
	
	
}
