package MethodCalling;

public class B {

	public static void main(String[] args) {
		System.out.println("B-Main");
		A.main(args);  //circular calling

	}

}
