package JavaSessions;

public class User {

	// class/global variables
	String name;
	int age;
	String city;
	boolean isActive;
	double salary;
	
	public static void main(String[] args) {
	
		// Class is a template/blueprint for creating Objects. 
		// It defines the characteristics and behaviors of that object 
		// Human: Category: template: class
		
		// create objects of user class: using new keywork
		User u1 = new User();   // RHS : Object
		
		// user : class  
		// new User() : Object
		// u1: object reference variable name 
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.isActive + " " + u1.salary);
		u1.name = "Tom";
		u1.age = 30;
		u1.city = "Pune";
		u1.isActive = true;
		u1.salary = 12.33;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city + " " + u1.isActive + " " + u1.salary);
		
		

	}

}
