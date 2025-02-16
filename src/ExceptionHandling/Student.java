package ExceptionHandling;

public class Student {
	
	public static int getMarks(String name) {
		System.out.println("getting marks for the student...." + name);
		
		if (name.equals("Rajat")) {
			try {
				int i = 9 / 0;
			} catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return 80;
			}
			finally {
				System.out.println("finally block");
				return 60;
			}
			// return 90;
		}
		else if(name.equals("Nitin")) {
			return 95;
		}
		else if(name.equals("Naveen")) {
			return 10;
		} else {
			System.out.println("plz pass the right student name...");
			return -1;
		}
	}

		public static void main(String[] args) {
			int m = Student.getMarks("Rajat");
			System.out.println(m);
		
			
		}
}
