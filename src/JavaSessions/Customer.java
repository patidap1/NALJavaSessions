package JavaSessions;

public class Customer {
	
	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
	
		Customer c1 = new Customer();
		c1.name = "Anu";
		c1.age = 35;
		c1.city = "Pune";
		
		Customer c2 = new Customer();
		c2.name = "Ravi";
		c2.age = 40;
		c2.city = "Bangalore";
		
		Customer c3 = new Customer();
		c3.name = "Vikas";
		c3.age = 30;
		c3.city = "LA";
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city); //Anu
		System.out.println(c2.name + " " + c2.age + " " + c2.city); //Ravi
		System.out.println(c3.name + " " + c3.age + " " + c3.city); //Vikas
		
		System.out.println("-----------------------------------");
		
		c1=c2;  //both will point to Ravi now  - first object will be with no reference now 
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city); //Ravi
		System.out.println(c2.name + " " + c2.age + " " + c2.city); //Ravi
		System.out.println(c3.name + " " + c3.age + " " + c3.city); //Vikas
		
		System.out.println("-----------------------------------");
		
		c2=c3; //break the current connection with Ravi and move to Vikas
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city); //Ravi
		System.out.println(c2.name + " " + c2.age + " " + c2.city); //Vikas
		System.out.println(c3.name + " " + c3.age + " " + c3.city); //Vikas
		
		System.out.println("-----------------------------------");
		
		c3=c1; //break the current connection with Vikas and move to Ravi
		
		System.out.println(c1.name + " " + c1.age + " " + c1.city); //Ravi
		System.out.println(c2.name + " " + c2.age + " " + c2.city); //Vikas
		System.out.println(c3.name + " " + c3.age + " " + c3.city); //Ravi
		
		// Garbage collector will destroy object with no reference i.e. 'Anu'
		
		// Assignment with 4 objects
		
		
		
		
	}

}
