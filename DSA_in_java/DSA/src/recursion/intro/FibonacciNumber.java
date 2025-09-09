package recursion.intro;

public class FibonacciNumber {
	
	static int fibonacci(int n) {
		
		//Base condition:
		if(n<2) {
			return n;
		}
		
		//This is not tail recursion because , first n-1 is called then n-2, then n-1 + n-2
		return fibonacci(n-1) + fibonacci(n-2); // -> Recursion relation //=> time complexity is not 2^n it is Golden ration ^ n
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(50)); //if we give 50 or larger than those  numbers, no answer because this linear recursion is not efficient since some part of recursion trees repeat , that where we should use dynamic programming which we will learn later.
		//i.e if in recursion calls two or more recursion calls are doing same work, then we dont need to compute - Dynamic programming
	}
}
