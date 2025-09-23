package recursion.part1;

public class ReverseANumber2 {
	
	static int reverseNum2(int n) {
		
		int digits = (int)(Math.log10(n)) + 1;
		
		return helper(n , digits);
	}

	static int helper(int n, int digits) {
		
		if(n % 10 == n) return n;
		
		int rem = n % 10;
		
		return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10 , digits - 1);
	}

	public static void main(String[] args) {

		System.out.println(reverseNum2(1234));
	}

}
