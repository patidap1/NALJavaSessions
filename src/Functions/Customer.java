package Functions;

import java.util.Arrays;

public class Customer {
	
	//page details : pageName(String), loadingTime(int), browserName(String), browserVersion(Double), isLoaded(boolean)
	public Object[] getPageDetails() {
		Object pageDetails[] = {"Amazon LoginPage", 15, "chrome", 126.90, true};
		return pageDetails;
		
	}
	

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Object[] details = c1.getPageDetails();
		
		System.out.println(details.length);
		System.out.println(Arrays.toString(details));
	}

}
