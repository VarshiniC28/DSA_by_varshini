package maths.dsa;

public class NoOfDigitsInNumOfBaseb {

	public static void main(String[] args) {

		//To find number of digits in binary representation or base b representation of a number
//		int n = 34567;
//		int base = 10; //decimal
		
		int n = 34567;
		int base = 2; //binary
		int ans = (int)(Math.log(n)/Math.log(base)) + 1;
		System.out.println(ans);
		
	}

}
