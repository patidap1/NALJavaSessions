package JavaSessions;

public class Employee {

	int empId;
	String name;
	int age;
	String dept;
	boolean isPermament;
	
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		e1.empId = 100;
		e1.name = "Tom";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.dept);
		e1.dept = "HR";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.dept);
		e1.name = "Tom Peter";
		System.out.println(e1.empId + " " + e1.name + " " + e1.age + " " + e1.dept);
		
		System.out.println("-----------------------------");
		
		Employee e2 = new Employee();
		e2.empId = 101;
		e2.name = "Mohan";
		System.out.println(e2.empId + " " + e2.name + " " + e2.age + " " + e2.dept);
		e2.dept = "SW";
		System.out.println(e2.empId + " " + e2.name + " " + e2.age + " " + e2.dept);
		e2.name = "Hari";
		System.out.println(e2.empId + " " + e2.name + " " + e2.age + " " + e2.dept);		
	
		System.out.println("-----------------------------");
		
		//no ref object  - also called as 'anti patterns'
		new Employee().empId = 300;
		new Employee().name = "Anu";  // new object will be created, unnecessary objects will be created
		
		
		//null reference object
		Employee e3 = new Employee();
		e3 = null;  // this will break the connection
		e3.empId = 400; ///NPE
		System.out.println(e3.empId);
		
		
		System.gc();  // Call GC ( garbage collector) but no gurantee [JVM will tell]
		
		//
		Employee e4 = new Employee();
		e4.empId = 123;
		
		// object will be created in Heap memory always, references will be in Stack memory
		
		
		
	}

}
