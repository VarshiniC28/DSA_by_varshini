package recursion.part1;

public class Recursion {
	
	//Print all numbers from n to 1
	static void fun(int n) {
		if(n==0) return;
		
		System.out.println(n);
		fun(n-1);
	}
	
	//For the same above question, for f(n) print 1 2 3 4 5 - vice versa of above
	//To do that we just print first call the function and then print .
	static void funrev(int n) {
		if(n==0) return;
		
		funrev(n-1);
		System.out.println(n);
	}
	
	//Now to do above both functions :
	static void funBoth(int n) {
		if(n==0) return;
		
		System.out.println(n);
		funBoth(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		  
		fun(5);
		
		System.out.println("----------------------------------------------------");
		
		funrev(5);
		
		System.out.println("-----------------------------------------------------");
		
		funBoth(5);
	}
}
