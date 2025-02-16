package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	
	public String getName() {
		return name;
	}
	
	//public methods : getter/setter:
	
	public void setName(String name) {
		if(name == null) {
			System.out.println("name value can not be null");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 18) {
			
			
		}
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	} 

	
}
