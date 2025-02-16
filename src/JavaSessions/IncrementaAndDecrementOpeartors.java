package JavaSessions;

public class IncrementaAndDecrementOpeartors {

	public static void main(String[] args) {

		//++ and -- operators
		
		//1. Post(later) Increment: ++
		int a = 1;
		int b = a++;
		System.out.println(a);  //2
		System.out.println(b);  //1
		
		int c = -98;
		int d = c++;
		
		System.out.println(c); //-97
		System.out.println(d); //-98
	
		// Pre(before) Increment: ++
		int e = 1;
		int f = ++e;
		System.out.println(e); //2
		System.out.println(f); //2
		
		int p = -999;
		int q = ++p;
		System.out.println(p); //-998
		System.out.println(q); //-998
		
		//3. Post(later) decrement:
		int x = 2;
		int y = x--;
		System.out.println(x);  //1
		System.out.println(y);  //2
		
		//4. Pre(before) decrement:
		int v = 2;
		int w = --v;
		System.out.println(v); //1
		System.out.println(w); //1
		
		int t1 = -99;
		int t2 = --t1;
		System.out.println(t1); //-100
		System.out.println(t2); //-100
		
		int total = 10;
		System.out.println(total++); //original value will be consumed
		
		System.out.println(total); //updated value
		
		int pop = 10;
		System.out.println(++pop); //11
		System.out.println(pop); //11
		
		int m = 2;
		int n = 3;
		// int sum = m++ - n++ + ++m - --n;
		//(2+1) - (3+1) + (1+3) - (-1-4) = 3-4+4-5
		// System.out.println(sum); //0
		
		int sum = ++m - n++ + --m - n++;
		
		System.out.println(sum); //-2
		System.out.println(m); //2
		System.out.println(n); //5
		
		
		char cc = 'a';
		System.out.println(++cc);
		
		
	}

}
