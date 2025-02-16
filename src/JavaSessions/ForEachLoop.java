package JavaSessions;

public class ForEachLoop {

	public static void main(String[] args) {
		// modern way to iterating the things
		
		int i[] = {10,20,30,40};
		
	// index loop
		for(int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);
			
		}
		System.out.println("-----------------");
		
		// for each loop
		// Advance - no need to use any condition 
		for(int e : i) {
			System.out.println(e);
		}
		
		System.out.println("-----------------");
		
		int p[] = new int[4];
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		p[3] = 40;
		
		for(int naveen : p) {
			System.out.println(naveen);
		}

		System.out.println("-----------------");
		
		String browser[] = {"chrome", "firefox", "ie", "edge"};
		for(String br :browser) {
			System.out.println(br);
			if(br.equals("firefox")) {
				System.out.println("Launch ff");
				break;
			}
			
		}
		
		System.out.println("-----------------");
		
		int m[] = {10,20,30,40}; //0-3
		
		int count = m.length-1; //4
			for(int t : m) {
				t=count; //3
			System.out.println(m[t]);
			count--;
			
		
		// wrong code
		// for(int t : m) {
		//	System.out.println(t);
		//	System.out.println(m[t]);
		//	t--;
			
			
			
		}
		
	}

}
