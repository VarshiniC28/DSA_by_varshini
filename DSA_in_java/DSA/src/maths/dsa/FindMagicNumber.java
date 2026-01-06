 package maths.dsa;

//Find the nth magic number (Amazon)
/*
 * Explanation: Magic number =  multiply each bit of binary form of a decimal number with power of 5 - as below
 * 
 * 1 - 001(binary) => Magic number = 0 * 5^3 + 0 * 5^2 + 1 * 5^1 = 5
 * 2 - 010(binary) => Magic number = 0 * 5^3 + 1 * 5^2 + 0 * 5^1 = 5^2 = 25
 * 3 - 011(binary) => Magic number = 0 * 5^3 + 1 * 5^2 + 1 * 5^1 = 25 + 5 = 30
 * 4 - 100(binary) => Magic number = 1 * 5^3 + 0 * 5^2 + 0 * 5^1 = 125
 * 5 - 101(binary) => Magic number = 1 * 5^3 + 0 * 5^2 + 1 * 5^1 = 130
 * 6 - 110(binary) => Magic number = 1 * 5^3 + 1 * 5^2 + 0 * 5^1 = 150 ( Lets say we have to find this - i.e 6th magic number)
 * 
 * */

public class FindMagicNumber {

	public static void main(String[] args) {

		int n = 6;
		int ans = 0;
		int base = 5;
		while(n>0) {
			int last = n & 1;
			n = n>>1; //right shift every time to get all digits of bits at last
			ans += last * base;
			base = base * 5; //every time multiply by 5
		}
		
		System.out.println(ans);
	}

}
