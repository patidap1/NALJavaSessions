package OOP_Encapsulation;

public class userTest {

	public static void main(String[] args) {
		
		User u1 = new User("Naman", 30, 20.33, true);
		System.out.println(u1.getName()+" "+u1.getAge()+" "+u1.getSalary()+" "+u1.isActive());  //GET - read 
		
		u1.setSalary(45);  // PUT/Patch - update 
		System.out.println(u1.getName()+" "+u1.getAge()+" "+u1.getSalary()+" "+u1.isActive()); //GET - read

		u1.setAge(40);
		System.out.println(u1.getName()+" "+u1.getAge()+" "+u1.getSalary()+" "+u1.isActive()); //GET - read
				
	}
}
