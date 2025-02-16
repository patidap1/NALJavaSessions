package Functions;

public class Employee {
	
	// Class members
	// 1.Variables - Static and Non-static(instance/object)
	// 2. methods/functions: static and non-static functions

	//Methods - 
	// 1. Can not create a function/method inside a function
	// 2. Function can not be a duplicate but it can be duplicate called method overloading
	
	// Types
	// 1. No input and no return
	// void: function has no return

	public void test() {   //name: camel casing - start with small letter "testFeature"
		// method/function body
		System.out.println("Test Method");
		
	}
	
	// 2. no input but some return
	//return type: int
	public int add() {
		System.out.println("Add method");
		int a = 10;
		int b = 20;
		int c = a+b; //30
		return c;
	}
	
	public String getTrainer( ) {
		
		System.out.println("getting the trainer name");
		String name = "naveen";
		return name;
	}
	
	// return type: boolean
	public boolean isUserActive() {
		System.out.println("check user is active");
		return true;
	}
	
	// 3. some input and return
	public int sum(int a, int b) {   //a, b : input parameters
		System.out.println("sum method");
		int z = a+b;
		return z;
	}
	
	// return type : String
	// param : 1
	// only one parameter is return at a time
	public String getCourseTrainer(String courseName) { // 1 parameter
		System.out.println("getting trainer name");
		if (courseName.equals("testing")) {
			return "Naveen";
		} else if (courseName.equals("development")) {
			return "Tom";
		} else {
			System.out.println("course not found..." + courseName);
			return null;
		}

	}
	
	//execution always start from the main method
	public static void main(String[] args) {

		// To call a function - create an object of the class
		Employee e1 = new Employee();
		e1.test();

		// System.out.println(e1.add()); --- do not use

		// store it in a variable and use it
		int m = e1.add();
		System.out.println(m); // 30

		String s = e1.getTrainer();
		System.out.println(s);

		boolean flag = e1.isUserActive();
		System.out.println(flag);

		if (flag) {
			System.out.println("give the permission");
		} else
			System.out.println("no persmission");

		int d = e1.sum(10, 20); //values/arguments: call by value -calling a function by passing a value
		
		System.out.println(d);
		
		String name = e1.getCourseTrainer("testing");
		System.out.println(name);
		if(name == null) {
			System.out.println("no fee is added");
		}
		if(name.equals("Naveen"))
		{
			System.out.println("some fee is added");
		}
			
			

	}

}
