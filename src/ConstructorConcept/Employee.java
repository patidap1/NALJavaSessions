package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String city;
	boolean isActive;
	double salary;
	
	// constructor
	// name : will be same as the class name
	// const : is not a function (but look like a function) 
	// const : can never have any return type, no void, no return keyword
	// const : can have params 
	// const : will be called when you create an object using object reference variable 
	// if the default const. is not available. then jvm will add one default hidden Const. in the class at the runtime 
	// const : can be overloaded
	
	public Employee() {
		System.out.println("default const....0 param");	
	}
	public Employee(int a ) {
		System.out.println("default const....1 param" + a);	
	}
	public Employee(int a, int b) {
		System.out.println("default const....1 param" + a + b);
	}
	public Employee(int a, String b) {
		System.out.println("default const....1 param" + a + b);
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee();  //object creation - first const will be called
		Employee e2 = new Employee(10); // const 2 (line 26) will be called 
		Employee e3 = new Employee(10, 20); //const 3 will be called 
		Employee e4 = new Employee(10, "Selenium"); //const 4 will be called 
		

		

	}

}
