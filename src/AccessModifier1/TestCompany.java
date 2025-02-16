package AccessModifier1;

public class TestCompany {

	public static void main(String[] args) {
		Company obj = new Company();
		// Company obj1 = new Company(10);
		Company obj2 = new Company("Naveen");
		Company obj3 = new Company(12.22);
		
		ExcelUtil.readExcel();
		
		System.out.println("hello world");
		
		//log4j api;
		// log.info("hello World");
		
		// which one is faster - log.info will be faster since it allows multi threading - 
		// everyone will have their own copy
		
		
		
	}

}
