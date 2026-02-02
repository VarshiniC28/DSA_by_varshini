package math.prbs;

public class PalindromeNum {
	
	static boolean rev(int num) {
		
		int original = num;
		int rev = 0;
		
		while(num > 0) {
			rev = rev * 10 + num % 10;
			num=num/10;
		}
		
		return rev==original;
	}
	
	//optimal
	static boolean palindrome(int num) {
		if(num<0 || (num % 10 == 0 && num != 0)) return false;
		
		
		int rev = 0;
		while(num > rev) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		return num == rev || num == rev/10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome(12344321));
	}

}
