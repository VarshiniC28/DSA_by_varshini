package recursion.intro;

public class FibonacciNumber {
	
	static int fibonacci(int n) {
		
		//Base condition:
		if(n<2) {
			return n;
		}
		
		//This is not tail recursion because , first n-1 is called then n-2, then n-1 + n-2
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(6 ));
	}
}
