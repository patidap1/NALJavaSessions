package MethodCalling;

public class A {

	// JVM will call main method, it will call B.main so 2 objects will be created in stack 
	public static void main(String[] args) {
		System.out.println("A-Main");
		B.main(args);
	}

}
