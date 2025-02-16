package MethodOverloading;

public class Employee {
	
	// duplicate function not allowed in the same class
	// can not create a function inside a function
	
	// Method Overloading: OOP :  Polymorphism = Poly(many)+Morphism(forms) : Static(compile time)
	// Within same class -  if you have multiple functions with:
	//1. Same name
	//2. Different number of params
	//3  Different sequence of params
	//4. Return type does not matter
	
	
	public void test() {		
		System.out.println("test method");
	}
	
	public void test(int a) {	
		System.out.println("test method " + a);
	}
	
	public void test(String a) {
	}
	
	public void test(int a, int b) {
	}
	
	public void test(String a, int b) {
	}
	
	public void test(int a, String b) {
		System.out.println("Test Method " + a+b);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.test();
		e1.test(10);
		e1.test(10, "Naveen");
		
	}

}
