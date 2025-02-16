package mapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapUseCases {
	
	public static String getCredentials(String role) {
		System.out.println("getting user credentials for role : " + role);
		
		
		// Always go for top casting - use map Interface
		Map<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin@open.com;admin@123");
		credMap.put("seller", "seller@open.com;seller@123");
		credMap.put("customer", "nitin@gmail.com;nitin@123");
		credMap.put("vendor", "deepika@open.com;deep@123");
		credMap.put("partner", "bhagya@partner.com;bhagya@123");
		
		return credMap.get(role);
	}

	public static void main(String[] args) {
		
		//Key-Value pair:
		//1. RBAC feature: (Role Based Access Control) - admin, naveen, seller, partner, vendor, distributor
		//2. Product Data: meta data, price
		//3. Excel data: <k, v>: <String, List<String>>
		//4. Value from db: <k,v>
		//5. API testing: headers <String, String : <"Authorization", "Bearer Token">
		//6. Query Params: 
		//7. json/xml:
		
		String creds = getCredentials("vendor");
		System.err.println(creds);
		String credArr[] = creds.split(";");
		String username = credArr[0].trim();
		String password = credArr[1].trim();
		
		System.out.println("login with : " + username + " and " + password);

		

	}

}
