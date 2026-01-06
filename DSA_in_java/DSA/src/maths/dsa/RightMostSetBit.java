package maths.dsa;

public class RightMostSetBit {

	public static void main(String[] args) {
		
		//Find the rightmost set bit position

		int n = 18;
		
		int rmsb = n & (-n); // -n is 2' complement(invert and add 1 )
		System.out.println(Integer.numberOfTrailingZeros(rmsb)+1);
		
		//or just this one line also does that same - 18 - 010010 - position = 2 - no of trailing zeros = 1 - 1+1 = position
		System.out.println(Integer.numberOfTrailingZeros(n)+1);
	}

}
