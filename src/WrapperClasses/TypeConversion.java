package WrapperClasses;

public class TypeConversion {

	public static void main(String[] args) {

		// int -- primitive
		// Integer --class(Wrapper class)
		// generics -- Integer

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println("------------");

		// 1. String to int:
		String x = "100";
		System.out.println(x + 20); // 10020

		int i = Integer.parseInt(x); // 100
		System.out.println(i + 20); // 120

		String y = "$100";
		// int j = Integer.parseInt(y); //NumberFormatException
		int j = Integer.parseInt(y.replace("$", ""));
		System.out.println(j + 50);
		System.out.println("------------");

		// 2. String to double
		String price = "12.33";
		System.out.println(price + 10); // 12.3310 - will concatenate

		double actPrice = Double.parseDouble(price); // 12.33
		System.out.println(actPrice + 10); // 22.33 - will add

		System.out.println("------------");

		// 3. int to String
		int p = 100;
		String value = String.valueOf(p); // "100"
		System.out.println(value + 20); // 10020 - will do concatenation
		
		double q = 12.33;
		String qVal = String.valueOf(q);
		System.out.println(qVal);
		System.out.println(qVal.length());
		
		boolean flag = true;
		String fg = String.valueOf(flag);
		System.out.println(fg+"automation"); //trueautomation
		
		
		//4. String to boolean
		String remote = "true";
		boolean rm = Boolean.parseBoolean(remote); // true
		
		if(rm) {
			System.out.println("run tests on aws cloud");
			}
		else {
			System.out.println("run tcs in local");
		}
	}

}
