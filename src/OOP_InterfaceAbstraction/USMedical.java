package OOP_InterfaceAbstraction;

public interface USMedical extends WHO{
	
	//interface vars are static and final in nature (by default):
	int min_fee = 100;
	
	//In Interface we can not define the method body
	//only method body, no method implementation
	//only method declaration - only method prototype\
	//Abstract method - no method body
	//can not create object of interface
	
	//100% abstraction - hiding the implementation here
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	public void payment(int amount);

	//from jdk 1.8, there are two major changes in interface:
	
	//1. we can have a method with body: but it should be a static method
	public static void medicalBilling() {
		System.out.println("USM - medical billing");
	}
	
	//2. we can have a default method with method body: (non static)
	// but it can be overridden with public method
	default void medicalNews() {
		System.out.println("USM - medical news");
	}
	
	
}
