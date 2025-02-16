package ThisConstructor;

public class Employee extends Company {

	String name;
	int age;
	
	public Employee() {	
		// this("Tom", 30);
		System.out.println("emp - default constuctor");
	}
	
	public Employee(String name, int age) {
		//both this and super should be the first statement
		this(); //call current class constructor 
		// super(); now allowed
		
		System.out.println("emp const...");
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee("tom", 30);

		// System.out.println(e1.name);
		// System.out.println(e1.age);
		
		
	}

}
