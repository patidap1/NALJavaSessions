package AccessModifier1;

public class ExcelUtil {

	//common methods to be accessible from everywhere without creating the object
	
	public ExcelUtil() {}
	
	public static int readExcel() {
		System.out.println("read excel");
		return 100;
	}
	
	public static void writeExcel() {	
		System.out.println("write excel");
	}
	
	public static void deleteFile() {	
		System.out.println("delete excel");
	}
	
	public static void updateFile() {	
		System.out.println("update excel");
	}
	
	
}
