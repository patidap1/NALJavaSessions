package ConstructorConcept;

public class user {

	// const is helping to construct the object properly
	// const is helping to prevent unncessary object creation
	// const.. is helping to initiate the class instance variable with the local variable using this keyword
	// instance variables
	String name;
	int age;
	String city;
	boolean isActive;
	double salary;

	public user(String name, int age) { // local variables
		// name = name1;  //Global = local
		// age = age1;  //Global = local
		// to create the variable name same as global 
		// this keyword - to access global variables
		this.name = name; //Global = local
		this.age = age;
	}
	
	public user(String name, int age, double salary) { // local variables
		this.name = name; //Global = local
		this.age = age;
		this.salary = salary;
	}

	public user(String name, int age, String city, boolean isActive, double salary) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
		this.salary = salary;
	}

	public static void main(String[] args) {
		user u1 = new user("Nitin", 30);
		System.out.println(u1.name);
		System.out.println(u1.age);
		
		System.out.println("--------------");

		user u2 = new user("Rajat", 35, 34.44);
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.isActive);
		System.out.println(u2.salary);
		System.out.println(u2.city);
		
		System.out.println("--------------");
		
		user u3 = new user("Sanju", 30, "Pune", true, 24.44);
		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.isActive);
		System.out.println(u3.salary);
		System.out.println(u3.city);
		
	}

}
