package OOP_InterfaceAbstraction;

public interface Dept {
	
	default void defineSalary() {
		System.out.println("dept - define salary");
	}

	default void allocateBudget() {
		System.out.println("dept - define salary");
	}
	
	default void definePackage() {
		System.out.println("dept - define salary");
	}
}
