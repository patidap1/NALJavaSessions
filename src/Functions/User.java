package Functions;

public class User {

	public void printInfo() {
		System.out.println("user info");
		return; // also allowed (blank return) with void
	}
	
	// function : getUserMarks
	//Paramm: String userName
	//Return the user marks (0-100) : int
	
	
	// Single return
	public int getUserMarks(String userName) {
		System.out.println("calculating user marks.." + userName);
		int marks = -1;  // some negative/invalid value to initialize 
		
		switch (userName){
		case "nitin":
			marks = 90;
			break;
		case "anu":
			marks = 95;
			break;
		case "rajat":
			marks = 100;
			break;
		default:
			System.out.println("please pass the right username..." + userName);
			break;
			
		}
		return marks;
	}
	
	
	// multiple return statements
	public int getStudentMarks(String studentName) {
		System.out.println("calculating user marks.." + studentName);
		
		
		switch (studentName){
		case "nitin":
			return 90;
		case "anu":
			return 95;
		case "rajat":
			return 100;
		default:
			System.out.println("please pass the right username..." + studentName);
			return -1;
			
		}
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		u1.printInfo();
		int m = u1.getUserMarks("rajat");
		System.out.println(m);
		
		if(m>0) {	
			System.out.println("print the marksheet");
		}
		
		int n = u1.getStudentMarks("anu");
		System.out.println(n);
		
		if (n>=0) {
			
			System.out.println("print the marksheet");
		}
	}

}
