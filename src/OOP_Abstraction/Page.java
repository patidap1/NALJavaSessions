package OOP_Abstraction;

public abstract class Page {
	
	//can not create the object of abstract class
	//can have abstract methods and non standard methods
	//can have the constructor of the abstract class?? YES
	//it will be called when you create the object of the child class
	
	//0 to 100% abstraction
	//0% abstraction : no abstract methods
	//100% abstraction : all abstract methods
	//partial abstraction: abstract + non abstract methods

	public Page() {
		System.out.println("Page - default const...");
	}
	
	public Page(int a) {
		System.out.println("page - one param const..." + a);
	}
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadTimeOut() {
		System.out.println("page load timoeut in 20 sec");
	}
	
	public final void logo() {
		System.out.println("page -- logo");
	}
	
	
}
