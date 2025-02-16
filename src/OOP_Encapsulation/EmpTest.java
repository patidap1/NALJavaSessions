package OOP_Encapsulation;

public class EmpTest {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(30);
		e1.setSalary(23.44);
		e1.setActive(true);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.isActive());
		
		LoginPage lp = new LoginPage();
		
		lp.setUsername("NaveenAutomation");
		lp.setPassword("Diebold123");
		
		
	}

}
