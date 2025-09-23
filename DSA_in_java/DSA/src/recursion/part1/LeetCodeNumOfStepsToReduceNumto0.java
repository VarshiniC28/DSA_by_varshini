package recursion.part1;

public class LeetCodeNumOfStepsToReduceNumto0 {
	
	static int count (int n) {
		return helper(n, 0);
	}

	static int helper(int n, int c) {
		if(n == 0) return c;
		if((n & 1) == 0) return helper(n/2, c+1);
//		else if((n & 1) == 0) 
		return helper(n-1, c+1);
	}

	public static void main(String[] args) {

		System.out.println(count(16));
	}

}
