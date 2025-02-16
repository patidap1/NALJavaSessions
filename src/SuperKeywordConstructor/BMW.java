package SuperKeywordConstructor;

public class BMW extends Car{
	
	public BMW() {	
		super();
		System.out.println("BMW default constuctor..");
	}
	
	public BMW(int a) {	
		super();
		System.out.println("BMW one param constuctor.."+a);
	}
	
	public BMW(String name, int price) {	
		super(name, price); //must be the first statement in the child class constructor
		// super(); // also not allowed since it is second statement 
		System.out.println("BMW two param constuctor.."+ name +" " + price);
		// super(name, price); /// not allowed
	}

}

//super:
//1. Can be used in child class const. but it must be the first statement
//2. can be used to call the parent class properties(vars/methods) from the child class methods
//3. it could be any statement number