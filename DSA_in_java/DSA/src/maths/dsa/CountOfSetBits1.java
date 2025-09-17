package maths.dsa;

public class CountOfSetBits1 {
	
	static int setBits(int n) {
		int count = 0;
	
		//Way 1
//		while(n > 0) {
//			if((n & 1) == 1) count++; //last digit & 1 gives us which number is at last
//			n = n>>1; //right shift
//		}

		
		
//		Way 2 
//		while(n > 0) {
//			count++;
//			n -= (n & -n); //no of iterations = no of 1's here
//		}	
		
		
		//Way 3
		while(n > 0) {
			count++; //Here also no of iterations till n becomes 0 = no of 1's /set bits in the n
			n = (n & (n-1));
		}
		
		
		return count;
	}

	public static void main(String[] args) {

		int n = 45;
		System.out.println(Integer.toBinaryString(n)); //we can see the binary representation of our number 
		
		System.out.println(setBits(n));
		
	}

}
