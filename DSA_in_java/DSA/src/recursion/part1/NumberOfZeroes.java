package recursion.part1;

public class NumberOfZeroes {
	
	static int count(int n) {
		return zeroes(n, 0);
	}
	
	static int zeroes(int n, int c) { //c - count
		
		if(n == 0) return c;
		
		if(n % 10 == 0) {
			return zeroes(n/10, c+1);
		}
		else {
			return zeroes(n/10, c);
		}
		
	}

	public static void main(String[] args) {

		System.out.println(count(302004));
	}

}
