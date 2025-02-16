package MethodCalling;

public class User {

	public void m1() {		
		System.out.println("m1 method");
		m2();
		// User.t1();
	}
	public void m2() {		
		System.out.println("m2 method");
		m3();
	}
	public void m3() {		
		System.out.println("m3 method");
		// m1();  
		
		
		// static objects will go in CMA
		// non static objects will go in Heap Memory
		// Execution will happen inside the stack memory
		
		
		// circular calling  - this will cause Stack Overflow error 
		// stack will be allocated /assigned but  de-allocation won't happen
		// LIFO - de-allocation will happen with last method first 
		// stack execution animation 
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
		User u2 = new User();
		u2.m1();
	}
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	public static void t3() {
		System.out.println("t3 method");
	}
	
	
	public static void main(String[] args) {
		
		//NS --> S : If any non static method want to access Static method- simply use the class name.method
		//S --> NS: use object ref name 
		//s --> S : use class name
		//NS --> NS : call them directly (no need to create extra object) 
		
		User u1 = new User();
		u1.m1();

		// User.t1();
			
	}

}
