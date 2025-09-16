package maths.dsa;

public class PascalTriangleNthRow {

	public static void main(String[] args) {

		//Pascal triangle:
		/*
		 * 1			 => 1
		 * 1 1			 => 2
		 * 1 2 1		 => 4
		 * 1 3 3 1		 => 8
		 * 1 4 6 4 1     => 16
		 * 1 5 10 10 5 1 => this sum is 32
		 * 
		 * => and these sums are 2 powers
		 * */
		
		//Calculate sum of nth row in Pascal triangle
		int n = 6;
		
		int ans = 1 << (n-1);
		System.out.println(ans);
		
	}

}
